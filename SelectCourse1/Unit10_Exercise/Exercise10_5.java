package Unit10_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise10_5 {

    public static int CountOneInFile(BufferedReader br) throws IOException {
        String line = br.readLine();

        if (line == null) {
            return 0;
        }
        if (Integer.parseInt(line) == 1) {
            return 1 + CountOneInFile(br);
        } else {
            return CountOneInFile(br);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/java/Unit10_Exercise/Exercise10_5.txt"));

        System.out.println(CountOneInFile(br));
        br.close();
    }

}
