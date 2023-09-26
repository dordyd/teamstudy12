package SelectCourse1.CH.chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class prac08_02 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int input, count = 0, sum = 0;
        do {
            input = Integer.parseInt(br.readLine());
            sum += input;
            count++;
        } while (input != 0);
        System.out.println(sum / (double) (count - 1));
    }
}
