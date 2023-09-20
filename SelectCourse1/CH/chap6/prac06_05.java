package SelectCourse1.CH.chap6;

import java.util.Scanner;

public class prac06_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(pi(n));
    }

    public static double pi(int n) {
        double result = 0D;
        double divideNum = -1;
        for (int i = 0; i < n; i++) {
            divideNum *= -1;
            result += 4 / (divideNum * (i * 2D + 1));
        }
        return result;
    }
}
