package SelectCourse1.CH.chap10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class prac10_05 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\Users\\나\\Desktop\\새 폴더\\teamstudy12\\SelectCourse1\\CH\\chap10\\10_05.txt");
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);
        System.out.println(file1Count(in));
    }

    public static int file1Count(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null)
            return 0;
        else
            return Integer.parseInt(s) + file1Count(br);

    }
}
