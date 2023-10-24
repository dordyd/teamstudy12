package Chapter5;

import java.util.Scanner;

public class Exercise5_6 extends AdditionQuestion {

    private AdditionQuestion[] questions;
    private int[] answerArr;
    private static final int QUESTION_COUNT = 10;
    private static final int POINT = 10;

    public void createQuestion() {
        questions = new AdditionQuestion[QUESTION_COUNT];
        for (int i = 0; i < QUESTION_COUNT; i++) {
            questions[i] = new AdditionQuestion();
        }
    }

    public void administerQuestion() {
        Scanner sc = new Scanner(System.in);
        answerArr = new int[QUESTION_COUNT];

        for (int i = 0; i < QUESTION_COUNT; i++) {
            System.out.print(questions[i].getQuestion());
            int userAnswer = sc.nextInt();
            answerArr[i] = userAnswer;
        }
        System.out.println("------------------------------");
    }

    public void gradeQuestion() {
        int correctCount = 0;

        for (int i = 0; i < QUESTION_COUNT; i++) {
            String question = questions[i].getQuestion();
            int userAnswer = answerArr[i];
            int correctAnswer = questions[i].getCorrectAnswer();

            System.out.printf("%-10s %d", question, userAnswer); // 맞춰 출력

            if (correctAnswer == userAnswer) {
                System.out.println(" | Correct!");
                correctCount++;
            } else {
                System.out.print(" | Wrong. | ");
                System.out.println("Answer is " + correctAnswer);
            }
        }
        System.out.println("------------------------------");
        System.out.println("Your Score : " + POINT * correctCount);
    }


    public void start() {
        createQuestion();
        administerQuestion();
        gradeQuestion();
    }

    public static void main(String[] args) {
        Exercise5_6 test1 = new Exercise5_6();
        test1.start();

    }
}

class AdditionQuestion {
    private int a, b;  // The numbers in the problem.

    public AdditionQuestion() { // constructor
        a = (int) (Math.random() * 50 + 1);
        b = (int) (Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + " ? ";
    }

    public int getCorrectAnswer() {
        return a + b;
    }
}



