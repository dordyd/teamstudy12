package Unit6_Exercise;

import java.util.Scanner;

public class Exercise06_9 {

    public static void solution(int h) {
        for (int i = 1; i <= h; i++) {

            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }


            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        solution(height);
    }
}
