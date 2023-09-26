package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise0802 {
    public static double inputWhileZero(BufferedReader br) throws IOException {
        double n = Double.parseDouble(br.readLine());
        double total = 0;
        int count = 0;

        while (n != 0) {
            total = n + Double.parseDouble(br.readLine());
            count++;
            n = Double.parseDouble(br.readLine());
        }

        return total / count - 1;

    }

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(inputWhileZero(br));
    }
}
