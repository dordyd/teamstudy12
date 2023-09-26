package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingTestFileEx {

    public static void main(String[] args) throws IOException {
//        FileWriter f = new FileWriter("test.txt");
//        PrintWriter out = new PrintWriter(f);
//
//        out.println("some text written on a file");
//
//        out.close();
//        f.close();

//        String[] v = {"I ", "love ", "java!! ㅠ"};
//        saveArray(v, "test1.txt");

//        readingFromFile();

//        System.out.println(Arrays.toString(loadArray("test1.txt")));

        File f1 = new File("test3.txt");
        File f2 = new File("test2.txt");
        boolean b = f1.renameTo(f2);
        System.out.println(b);


    }

    public static void saveArray(String[] v, String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);

        for (int i = 0; i < v.length; i++) {
            out.printf(v[i]);
        }

        out.close();
        f.close();
    }

    public static void readingFromFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        System.out.println(line);

        fr.close();
    }

    public static String[] loadArray(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        int n = 0;
        String line = br.readLine();
        while (line != null) {
            n++;
            line = br.readLine();
        }
        fr.close();

        String[] v = new String[n];
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        int i = 0;
        line = br.readLine();
        while ((line != null) && (i < n)) {
            v[i] = line;
            line = br.readLine();
            i++;
        }
        fr.close();
        return v;
    }

}
