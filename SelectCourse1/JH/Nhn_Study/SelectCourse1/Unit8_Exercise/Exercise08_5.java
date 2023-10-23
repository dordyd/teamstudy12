package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise08_5 {

    public static String printHighestAvgStudent(File filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        double highestAvg = 0;
        String highestAvgStudent = "";

        while (line != null) {

            int sum = 0;
            String[] arr = line.split(" ");
            for (int i = 1; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }

            double avg = sum / (arr.length - 1);


            if (avg > highestAvg) {
                highestAvg = avg;
                highestAvgStudent = arr[0];
            }
            line = br.readLine();
        }

        return highestAvgStudent;


    }

    public static void main(String[] args) throws IOException {
        File file = new File(
                "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/java/Unit8_Exercise/Exercise08_5.txt");
        System.out.println(printHighestAvgStudent(file));
    }
}
