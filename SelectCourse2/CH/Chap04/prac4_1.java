package SelectCourse2.CH.Chap04;

import java.util.Scanner;

public class prac4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        printCapitalized(input);
    }

    public static void printCapitalized(String input) {
        String answer = "";
        answer += Character.toUpperCase(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == ' ') {
                answer += Character.toUpperCase(input.charAt(i));
            } else {
                answer += input.charAt(i);
            }
        }
        System.out.println(answer);
    }
}