package SelectCourse2.YH.code.chap05.exercise0507;

import java.util.Scanner;

public class ReduceQuestion implements IntQuestion{
    private int a, b;
    public static int[] answer = new int[10];
    public static ReduceQuestion[] reduceQuestions = new ReduceQuestion[10];

    public ReduceQuestion() {
        a = (int) (Math.random() * 50 + 1);
        b = (int) (Math.random() * 50);
    }

    @Override
    public String getQuestion() {
        return "what is " + a + " - " + b + " ?";
    }

    @Override
    public int getCorrectAnswer() {
        return a - b;
    }

    public static void makeQuiz() {
        for (int i = 0; i < 10; i++) {
            reduceQuestions[i] = new ReduceQuestion();
            System.out.println(reduceQuestions[i].getQuestion());
        }
    }

    public static void quizAdmin() {
        for (int i = 0; i < 10; i++) {
            int index = i + 1;
            System.out.print("Answer Of Question " + index + " = ");
            Scanner scanner = new Scanner(System.in);
            answer[i] = scanner.nextInt();
        }
    }

    public static int checkQuiz() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int index = i + 1;
            if (answer[i] == reduceQuestions[i].getCorrectAnswer()) {
                count += 10;
            } else {
                System.out.println("Question " + index + " = " +reduceQuestions[i].getCorrectAnswer());
            }
        }
        return count;
    }

    public static void main(String[] args) {
        makeQuiz();
        quizAdmin();
        checkQuiz();
    }
}
