package SelectCourse1.CH.chap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import SelectCourse1.CH.chap8.prac08_06;

public class prac09_05 {
    File file;
    FileReader f;
    BufferedReader in;

    public prac09_05(String input) {
        this.file = new File(input);
        try {
            this.f = new FileReader(input);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        this.in = new BufferedReader(f);
    }

    public int countLines() {
        int n = 0;
        String line;
        try {
            line = in.readLine();
            while (line != null) {
                n++;
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return n;
    }

    public void write(OutputStream os) {
        OutputStreamWriter osw = new OutputStreamWriter(os);

        String line;
        try {
            line = in.readLine();
            while (line != null) {
                osw.write(line);
                line = in.readLine();
            }
            osw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void print() {
        String line;
        try {
            line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void copy(String filename) throws IOException {
        FileWriter f1 = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f1);
        String line = in.readLine();
        while (line != null) {
            out.println(line);
            line = in.readLine();
            out.flush();
        }
        f1.close();
    }

    public void delete() {
        file.delete();
    }

    public static void main(String[] args) {
        OutputStream os = System.out;
        prac08_06 a;
        try {
            a = new prac08_06("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/prac08_06.txt");
            a.print();
            System.out.println(a.countLines());
            a.write(os);
            a.copy("08copy");
            a.delete();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ;

    }
}
