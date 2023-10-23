/*Write a program that administers a basic addition quiz to the user. There should be ten questions.
 Each question is a simple addition problem such as 17 + 42, where the numbers in the problem are chosen at random (and are not too big). 
 The program should ask the user all ten questions and get the user's answers. After asking all the questions,
  the user should print each question again, with the user's answer. If the user got the answer right, the program should say so; 
  if not, the program should give the correct answer. At the end, tell the user their score on the quiz, where each correct answer counts for ten points.

The program should use three subroutines, one to create the quiz, one to administer the quiz, and one to grade the quiz.
 It can use three arrays, with three global variables of type int[], to refer to the arrays. The first array holds the first number from every question,
  the second holds the second number from every questions, and the third holds the user's answers.
*/

package SelectCourse2.Chap04;

import java.util.Scanner;

public class Prac4_8 {

    private static final int QUIZ_COUNT = 10;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static int[] firstNumArr;
    private static int[] secondNumArr;
    private static int[] userAnswerArr;

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

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < QUIZ_COUNT; i++) {
            System.out.print(firstNumArr[i] + " + " + secondNumArr[i] + " = ");
            int userAnswer = sc.nextInt();
            this.userAnswerArr[i] = userAnswer;
        }

        System.out.println("=========================");
        gradeQuiz();
    }

    public void gradeQuiz() {
        int countCorrectAnswer = 0;
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

        System.out.println("Your Score : " + countCorrectAnswer);
    }

    public static void main(String[] args) {
        Prac4_8 user1 = new Prac4_8();
        user1.createQuiz();
        user1.administerQuiz();
    }
}