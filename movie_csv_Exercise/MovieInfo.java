package movie_csv_Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MovieInfo {

    private List<List<String>> movie = new ArrayList<>();

    public void readToFile(String fileName) {
        BufferedReader br = null;

        try {
            br = Files.newBufferedReader(Paths.get("/Users/cholan/Desktop/Movie.csv"), Charset.forName("UTF-8"));
            String line = "";

            while ((line = br.readLine()) != null) {
                List<String> tmpList = new ArrayList<>();
                String[] array = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                array[1] = array[1].trim();
                if (array[1].charAt(0) != '"') {
                    array[1] = "\"" + array[1] + "\"";
                }
                tmpList = Arrays.asList(array);
                movie.add(tmpList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            movie.remove(0);
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static Comparator<List<String>> getReleaseYearcomparator() {

        return new Comparator<List<String>>() {

            @Override
            public int compare(List<String> o1, List<String> o2) {
                int one = Integer.parseInt(o1.get(4));
                int two = Integer.parseInt(o2.get(4));
                if (one < two) {
                    return -1;
                } else if (one > two) {
                    return 1;
                } else {
                    return 0;
                }
            }

        };
    }

    public static Comparator<List<String>> getTitlecomparator() {

        return new Comparator<List<String>>() {

            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }

        };
    }

    public int bisectionSearch(String key) {
        int mid;
        key = "\"" + key + "\"";

        int low = 0;
        int high = movie.size();
        String value;
        while (low <= high) {
            mid = (low + high) / 2;
            value = movie.get(mid).get(1);
            if (key.compareTo(value) == 0) {
                return mid;
            } else if (key.compareTo(value) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public void printWithIndex(int index) {
        System.out.println(movie.get(index));
    }

    public static void main(String[] args) {
        MovieInfo movie = new MovieInfo();
        Scanner scan = new Scanner(System.in);
        movie.readToFile("d");
        String input = scan.nextLine();

        System.out.println("검색하고싶은 카테고리를 입력해주세요. ex(Title, KoreanTitle,ReleaseYear,RunningTime)");
        if (input.equals("Title")) {
            Collections.sort(movie.movie, getTitlecomparator());
        }

        String userInput = scan.nextLine();
        movie.printWithIndex(movie.bisectionSearch(userInput));

    }

}