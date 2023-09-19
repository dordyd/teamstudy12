package Unit5_Exercise;

import java.util.Scanner;

public class Exercise05_6 {


    public static void answerQuestion(String question) {
        String start = String.valueOf(question.charAt(0));
        String last = String.valueOf(question.charAt(question.length() - 1));

        StringBuilder sb = new StringBuilder();

        if (start.equals("i") || start.equals("e") || start.equals("u") || start.equals("o") || start.equals("a")
                || start.equals("I") || start.equals("E") || start.equals("U") || start.equals("O") ||
                start.equals("A")) {
            sb.append("MAYBE").append(" ");
        }

        if (last.equals("a") || last.equals("i") || last.equals("u")) {
            sb.append("YES").append(" ");
        } else if (last.equals("e") || last.equals("o")) {
            sb.append("NO").append(" ");
        } else {
            sb.append("DON' T KNOW");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        answerQuestion(question);


    }
}
