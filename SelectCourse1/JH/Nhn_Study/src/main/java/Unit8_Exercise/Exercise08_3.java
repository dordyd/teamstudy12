package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise08_3 {

    public static void printLinesStartingWithChars(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            if ("/,;%".contains(line.substring(0, 1))) {
                System.out.println(line);
            }
            line = br.readLine();
        }

        fr.close();
    }


    public static void main(String[] args) throws IOException {

        String filePath =
                "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/java/Unit8_Exercise/Exercise08_3.txt";
        printLinesStartingWithChars(filePath);
    }
}
