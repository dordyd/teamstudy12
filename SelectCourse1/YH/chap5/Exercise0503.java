package chap5;

import java.util.Scanner;

public class Exercise0503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number thrre times: ");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());


        if (a == b && a == c && b == c) {
            System.out.println("it is regular");
        } else if (a != b && a != c && b != c) {
            System.out.println("it is irregular");
        } else {
            System.out.println("it is symmetric");
        }

    }
}
