package Chapter4;

import java.util.Scanner;

public class Exercise4_8 {

    private static final int QUIZ_COUNT = 10;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private int[] firstNumArr;
    private int[] secondNumArr;
    private int[] userAnswerArr;

    public void createQuiz() {
        this.firstNumArr = new int[QUIZ_COUNT];
        this.secondNumArr = new int[QUIZ_COUNT];
        for (int i = 0; i < QUIZ_COUNT; i++) {
            int firstNumber = (int) (Math.random() * MAX_NUMBER) + MIN_NUMBER;
            int secondNumber = (int) (Math.random() * MAX_NUMBER) + MIN_NUMBER;
            this.firstNumArr[i] = firstNumber;
            this.secondNumArr[i] = secondNumber;
        }
    }

    public void administerQuiz() {
        this.userAnswerArr = new int[QUIZ_COUNT];
        int countCorrectAnswer = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < QUIZ_COUNT; i++) {
            System.out.print(firstNumArr[i] + " + " + secondNumArr[i] + " = ");
            int userAnswer = sc.nextInt();
            this.userAnswerArr[i] = userAnswer;
        }
        System.out.println("=========================");

        for (int i = 0; i < 10; i++) {
            int firstNum = firstNumArr[i];
            int secondNum = secondNumArr[i];
            int userAnswer = userAnswerArr[i];
            System.out.print(firstNum + " + " + secondNum + " = " + userAnswer);
            if (firstNum + secondNum == userAnswer) {
                System.out.println("  Correct!");
                countCorrectAnswer++;
            } else {
                System.out.println("  Wrong.");
                int correctAnswer = firstNum + secondNum;
                System.out.println("Answer >> " + correctAnswer);
            }
        }
        System.out.println("=========================");
        gradeQuiz(countCorrectAnswer);
    }

    public void gradeQuiz(int countCorrectAnswer) {
        final int POINT = 10;
        System.out.println("Your Score : " + countCorrectAnswer * POINT);
    }


    public static void main(String[] args) {
        Exercise4_8 user1 = new Exercise4_8();
        user1.createQuiz();
        user1.administerQuiz();
    }
}
