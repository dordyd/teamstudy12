package SelectCourse1.CH.chap6;

import java.util.Scanner;

public class prac06_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        while (n != 1) {
            if (isPrime(i) && n % i == 0) {
                n /= i;
                if (n == 1) {
                    System.out.print(i);

                } else {
                    System.out.printf(i + ", ");
                }

            } else {
                i++;
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
