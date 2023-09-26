package chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Exercise0806 {
    static String filepath = "SelectCourse1/YH/chap8/ex0806data.txt";

    public static int countLines() throws IOException {
        File file = new File(filepath);
        int count = 1;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while (br.readLine() != null) {
            count++;
        }
        return count;
    }

    // public static void write(OutputStream os){
    //      file = new File(os);
    // }

    public static void print() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
    }

    public static void copy(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fileWriter);

        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        String copyStr = br.readLine();
        while (copyStr != null) {
            pw.println(copyStr);
            copyStr = br.readLine();
        }

        pw.close();
        fileWriter.close();
    }

    public static void delete() {
        File f = new File(filepath);
        f.delete();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countLines());

        print();
        String copyfilepath = "SelectCourse1/YH/chap8/ex0806copydata.txt";
        copy(copyfilepath);
        delete();

    }
}
