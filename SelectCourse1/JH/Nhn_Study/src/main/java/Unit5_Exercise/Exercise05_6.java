package Unit5_Exercise;

import java.util.Scanner;

public class Exercise05_6 {

    public static void answerQuestion(String question) {
        char start = Character.toLowerCase(question.charAt(0));
        char last = Character.toLowerCase(question.charAt(question.length() - 1));

        String result = "";

        if ("aeiou".contains(String.valueOf(start))) {
            result += "MAYBE ";
        }

        if ("aiu".contains(String.valueOf(last))) {
            result += "YES ";
        } else if ("eo".contains(String.valueOf(last))) {
            result += "NO ";
        } else {
            result += "DON'T KNOW";
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        answerQuestion(question);
        sc.close();
    }
}
