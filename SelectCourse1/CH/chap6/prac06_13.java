package SelectCourse1.CH.chap6;

import java.util.Scanner;

public class prac06_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
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
