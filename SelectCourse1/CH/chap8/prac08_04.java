package SelectCourse1.CH.chap8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class prac08_04 {
    public static void main(String[] args) throws IOException {
        multi(3);
    }

    public static void multi(int n) throws IOException {
        FileWriter f = new FileWriter("data.txt");
        PrintWriter out = new PrintWriter(f);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                out.printf("%d ", i * j);
            }
            out.println();
        }
        out.close();
        f.close();
    }
}
