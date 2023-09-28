package chap8.myexercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie>, Comparator<Movie> {
    long movieId;
    String title;
    String genres;


    public Movie(long movieId, String title, String genres) {
        this.movieId = movieId;
        this.title = title;
        this.genres = genres;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        int length = o1.title.length();
        if (o1.title.length() > o2.title.length()) {
            length = o2.title.length();
        }

        for (int i = 0; i < length; i++) {
            if (o1.title.charAt(i) - o2.title.charAt(i) != 0) {
                return o1.title.charAt(i) - o2.title.charAt(i);
            }
        }
        return 0;
    }

    @Override
    public int compareTo(Movie o) {
        int length = this.title.length();
        if (this.title.length() > o.title.length()) {
            length = o.title.length();
        }
        for (int i = 0; i < length; i++) {
            if (this.title.charAt(i) - o.title.charAt(i) != 0) {
                return this.title.charAt(i) - o.title.charAt(i);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "movieId = " + movieId + ", title=" + title + ", genres = " + genres;
    }
}
