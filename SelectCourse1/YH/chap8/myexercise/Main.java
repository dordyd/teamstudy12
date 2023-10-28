package chap8.myexercise;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieList movieList = new MovieList("/Users/younho/Documents/teamstudy12re/teamstudy12/SelectCourse1/YH/chap8/myexercise/movies.csv");
        movieList.copyTheFileToList();
        //movieList.printMovieList();
        movieList.movieTitleSort();
        movieList.printMovieList();
    }
}
