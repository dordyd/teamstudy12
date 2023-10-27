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

public class MovieInfoTest {

    private List<Movie> movie = new ArrayList<>();

    private Category category;

    public void readToFile(String fileName) {
        BufferedReader br = null;

        try {
            br = Files.newBufferedReader(Paths.get(fileName), Charset.forName("UTF-8"));
            String line = "";

            while ((line = br.readLine()) != null) {
                List<String> tmpList = new ArrayList<>();
                String[] array = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i].replaceAll("\"", "");
                }

                tmpList = Arrays.asList(array);
                movie.add(new Movie(tmpList));
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

    public int bisectionSearch(String key) {
        int mid;
        int low = 0;
        int high = movie.size();
        String value;
        while (low <= high) {
            mid = (low + high) / 2;
            value = movie.get(mid).getCategory(category);
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
        if (index == -1) {
            System.out.println("찾을 수 없습니다.");
            return;
        }
        System.out.println(movie.get(index));
    }

    public void sort(Comparator<Movie> comp) {
        Collections.sort(movie, comp);
    }

    public void sort(String input) {
        input = input.toUpperCase();
        category = Category.valueOf(input);
        Collections.sort(movie, getComparator(category));
    }

    public static Comparator<Movie> getComparator(Category category) {

        return new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getCategory(category).compareTo(o2.getCategory(category));
            }
        };
    }

}