package SelectCourse1.CH.chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class prac08_03 {
    public static void main(String[] args) throws IOException {
        print("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/prac08_03.txt");
    }

    public static void print(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);

        String line = "";
        line = in.readLine();
        while (line != null) {
            if (line.charAt(0) == '/' || line.charAt(0) == ';' || line.charAt(0) == '%') {
                System.out.println(line);
            }
            line = in.readLine();
        }

        f.close();
    }
}
