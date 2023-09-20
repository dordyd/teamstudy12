package SelectCourse1.CH.chap6;

import java.util.Scanner;

public class prac06_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(factorial(i));
        }

    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
