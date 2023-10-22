package SelectCourse2.CH.Chap05;

import java.util.Scanner;

class Question implements IntQuestion {

    private int a, b; // The numbers in the problem.

    public Question() { // constructor
        a = (int) (Math.random() * 50 + 1);
        b = (int) (Math.random() * 50);
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
    }

    public String getQuestion() {
        return "What is " + a + " - " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a - b;
    }

}

public class AdditionQuestion {

    private static IntQuestion[] questions;

    private static int[] answer = new int[10];

    public static void quizManager() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            questions[i] = new Question();
            System.out.print(questions[i].getQuestion());
            answer[i] = scan.nextInt();
        }

        gradeQuiz();
        scan.close();
    }

    public static void gradeQuiz() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (questions[i].getCorrectAnswer() == answer[i]) {
                System.out.println(questions[i].getQuestion() + answer[i] + "정답입니다");
                count++;
            } else {
                System.out.println(
                        questions[i].getQuestion() + answer[i] + "오답입니다. 정답은 = " + questions[i].getCorrectAnswer());
            }
        }
        System.out.println("10점 만점에 " + count + "점입니다");
    }

    public static void main(String[] args) {
        AdditionQuestion a = new AdditionQuestion();
        a.quizManager();
    }
}