import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class prac08_05 {
    public static void main(String[] args) throws IOException {
        System.out.println(print());
    }

    public static String print() throws IOException {
        File file = new File("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/prac08_05.txt");
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);
        String name = "";
        double max = Double.MIN_VALUE;
        String line = "";
        line = in.readLine();
        while (line != null) {
            String[] arr = line.split(" ");
            int sum = 0;
            for (int i = 1; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }
            double avg = sum / (double) (arr.length - 1);
            if (avg > max) {
                max = avg;
                name = arr[0];
            }
            line = in.readLine();
        }

        f.close();

        return name;
    }
}
