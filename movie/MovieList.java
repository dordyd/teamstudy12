package movie;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MovieList {

    private File filepath;
    private ArrayList<Movie> movieList = new ArrayList<>();

    public MovieList(String str){
        this.filepath = new File(str);
    }

    public void insertData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        String str = br.readLine();
        str = br.readLine();
        while (str != null) {
            String[] data = str.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            if(data[1].charAt(0) != '\"' && data[1].charAt(data[1].length()-1) != '\"'){
                data[1] = '\"' + data[1] + '\"';
            }
            movieList.add(new Movie.MovieBuilder(data[0], data[1], data[5], data[6]).build());
            str = br.readLine();
        }
    }

    public void printData(){
        System.out.println(movieList);
    }

    @Override
    public String toString() {
        return "\n";
    }

    public Comparator<Movie> comparator(){
        return (e1, e2) -> (e1.getTitle().compareTo(e2.getTitle()));
    }

    public void sort(){
        Collections.sort(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return ;
            }
        });
    }

    public void search(String str){
        Movie o = new Movie(str);
        int left = 0;
        int right = movieList.size()-1;
        int mid = 1;

        while (left <= right) {
            mid = (left + right) / 2;
            if (o.compareTo(movieList.get(mid)) < 0)
                right = mid - 1;
            else if (o.compareTo(movieList.get(mid)) > 0) {
                left = mid + 1;
            }
            else
                break;
        }
        System.out.println(movieList.get(mid));
    }
}
