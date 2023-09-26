package chap8.myexercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieList {
    private static String filepath;

    List movieListArray = new ArrayList<Movie>();


    public MovieList(String string) {
        this.filepath = string;
    }

    public void movieTitleSort() {
        movieListArray.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void filePrint() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        String str = br.readLine();
        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }
    }

    public void copyTheFileToList() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        String str = br.readLine();
        str = br.readLine();
        while (str != null) {
            String[] strArr = str.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            Movie movie = new Movie(strArr[0], strArr[1], strArr[2]);
            movieListArray.add(movie);
            str = br.readLine();
        }

    }

    public void printMovieList() {
        for (Object object : movieListArray) {
            System.out.println(object);
        }
    }

}
