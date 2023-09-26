package chap8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise0804 {

    public static void multiplyMatrix(String filename, int n) throws IOException {
        File f = new File(filename);
        FileWriter fileWriter = new FileWriter(f, false);
        PrintWriter pw = new PrintWriter(fileWriter);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                pw.print(i * j + " ");
            }
            pw.println();
        }

        pw.close();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        // FileWriter fw = new FileWriter("SelectCourse1/YH/chap8/ex0804data.txt");
        // PrintWriter pw = new PrintWriter(fw);
        // File f = new File("SelectCourse1/YH/chap8/ex0804data.txt");
        String filename = "SelectCourse1/YH/chap8/ex0804data.txt";

        multiplyMatrix(filename, 3);
    }

}
