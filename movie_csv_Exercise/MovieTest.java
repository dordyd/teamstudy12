package movie_csv_Exercise;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        MovieInfo movie = new MovieInfo();
        Scanner scan = new Scanner(System.in);
        movie.readToFile("/Users/cholan/Desktop/Movie.csv");

        while (true) {
            System.out.println("검색하고싶은 카테고리를 입력해주세요. ex(Title, KoreanTitle, ReleaseYear, RunningTime)");
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            try {
                movie.sort(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            while (true) {
                System.out.println("찾고싶은 영화의 " + input + "을 입력해주세요. (끝내려면 엔터)");
                String userInput = scan.nextLine();
                if (userInput.equals(""))
                    break;
                try {
                    System.out.println(movie.bisectionSearch(userInput));
                } catch (SearchNotFound e) {
                    System.out.println(e.getMessage());
                }

            }

        }

    }
}
