package SelectCourse1.CH.chap5;

import java.util.Scanner;

public class prac05_06 {

    static final char[] vocal = { 'a', 'i', 'u', 'e', 'o' };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        printAnswer(input);
    }

    public static void printAnswer(String arg) {
        char first = arg.charAt(0);
        for (int i = 0; i < 5; i++) {
            if (first == vocal[i]) {
                System.out.println("MAYBE");

            }

        }

        char last = arg.charAt(arg.length() - 1);
        for (int i = 0; i < 3; i++) {
            if (last == vocal[i]) {
                System.out.println("YES");
                return;
            }
        }

        for (int i = 3; i < 5; i++) {
            if (last == vocal[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("DON'T KNOW");
    }
}
