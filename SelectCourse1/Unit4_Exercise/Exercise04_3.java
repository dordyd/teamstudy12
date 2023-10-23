package Unit4_Exercise;

import java.util.Scanner;

public class Exercise04_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println((double) (num1 + num2) / 2);
        System.out.println(Math.sqrt(num1) + " / " + Math.sqrt(num2));
        System.out.println(Math.max(num1, num2));
    }
}
