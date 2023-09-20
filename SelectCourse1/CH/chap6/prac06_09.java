package SelectCourse1.CH.chap6;

import java.util.Scanner;

public class prac06_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPyramid(n);
    }

    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }
            for (int q = i; q > 0; q--) {
                System.out.print(q);
            }

            System.out.println();
        }
    }
}
