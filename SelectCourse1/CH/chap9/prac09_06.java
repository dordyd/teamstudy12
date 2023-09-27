package SelectCourse1.CH.chap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class prac09_06 {
    public static class ExceptionLineTooLong extends Exception {
        public ExceptionLineTooLong(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws IOException, ExceptionLineTooLong {
        File file = new File("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap9/prac09_06.txt");
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);

        String line = "";
        line = in.readLine();
        while (line != null) {
            if (line.length() > 80) {
                throw new ExceptionLineTooLong("Line > 80");
            }
            line = in.readLine();
        }

        f.close();
    }
}
