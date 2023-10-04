package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise08_2 {

    public static double average(InputStream is) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        int sum = 0;
        int count = 0;

        while (true) {

            String inputLine = br.readLine();
            int num = Integer.parseInt(inputLine);

            if (num == 0) {
                break;
            }

            if (num > 0) {
                sum += num;
                count++;
            } else {
                System.out.println("양수를 입력해주세요.");
            }

        }
        br.close();

        if (count == 0) {
            System.out.println("입력 값 없음.");
            return 0.0;
        } else {
            return (double) sum / count;
        }
    }


    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        double average = average(is);
        System.out.println(average);
    }


}
