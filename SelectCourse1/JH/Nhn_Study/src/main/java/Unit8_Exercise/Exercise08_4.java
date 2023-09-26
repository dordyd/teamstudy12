package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise08_4 {

    public static void printMatrix(File filename, int n) throws IOException {

        FileWriter fw = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fw);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n) {
                    pw.println(i * j);
                } else {
                    pw.print(i * j);
                    pw.print(" ");
                }
            }
        }

        pw.close();
        fw.close();

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }

        fr.close();

    }

    public static void main(String[] args) throws IOException {
        printMatrix(new File(
                        "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/java/Unit8_Exercise/Exercise08_4.txt"),
                4);
    }
}
