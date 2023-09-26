package SelectCourse1.CH.chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class prac08_01 {

    public static String[] loadArray(InputStream is, int n) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        return arr;
    }

    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(os);

        for (String a : sa) {
            osw.write(a);
        }
        osw.flush();

    }

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;
        FileInputStream isA = new FileInputStream(
                "/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/prac08_03.txt");
        saveArray(os, loadArray(is, 2));
    }
}
