package SelectCourse1.CH.chap6;

import java.util.Scanner;

public class prac06_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int positiveSum = 0;
        int negativeSum = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = scan.nextInt();
            if (j < 0) {
                negativeSum += j;
            } else {
                positiveSum += j;
            }
        }
        System.out.println("negative sum = " + negativeSum);
        System.out.println("positive sum = " + positiveSum);
    }
}
