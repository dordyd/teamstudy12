package chap8.myexercise;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieList movieList = new MovieList("SelectCourse1/YH/chap8/myexercise/movies.csv");
        movieList.copyTheFileToList();
//        movieList.printMovieList();
        movieList.movieTitleSort();
        movieList.printMovieList();
    }
}
