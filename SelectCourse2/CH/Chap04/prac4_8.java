package SelectCourse2.CH.Chap04;
/*
 * 
 * Write a program that administers a basic addition quiz to the user. There should be ten questions. 
 * Each question is a simple addition problem such as 17 + 42, where the numbers in the problem are chosen at random (and are not too big).
 * The program should ask the user all ten questions and get the user's answers. After asking all the questions, 
 * the user should print each question again, with the user's answer. (각 문제를 다시 정답과 함깨 써야한다)
 * If the user got the answer right, the program should say so; 
 * if not, the program should give the correct answer. At the end, tell the user their score on the quiz, where each correct answer counts for ten points.
 * The program should use three subroutines, one to create the quiz, one to administer the quiz, and one to grade the quiz.
 * It can use three arrays, with three global variables of type int[], to refer to the arrays. The first array holds the first number from every question, 
 * the second holds the second number from every questions, and the third holds the user's answers.
 */

import java.util.Scanner;

public class prac4_8 {
    static int[] one = new int[10];
    static int[] two = new int[10];
    static int[] answer = new int[10];

    public static void createQuiz() {
        for (int i = 0; i < 10; i++) {
            one[i] = (int) (Math.random() * 100) + 1;
            two[i] = (int) (Math.random() * 100) + 1;
            System.out.printf("%3d + %3d = ?\n", one[i], two[i]);
        }
    }

    public static void quizManager() {
        createQuiz();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            answer[i] = Integer.parseInt(scan.nextLine().split(" ")[4]);
        }

        gradeQuiz();
        scan.close();
    }

    public static void gradeQuiz() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (one[i] + two[i] == answer[i]) {
                System.out.printf("%3d + %3d = %3d 정답입니다.", one[i], two[i], answer[i]);
                count++;
            } else {
                System.out.printf("%3d + %3d = %3d 오답입니다. 정답은 %3d입니다,", one[i], two[i], answer[i], one[i] + two[i]);
            }
            System.out.println();
        }
        System.out.println("10점 만점에 " + count + "점입니다");
    }

    public static void main(String[] args) {
        quizManager();
    }
}
