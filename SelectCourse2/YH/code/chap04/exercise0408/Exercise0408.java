package SelectCourse2.YH.code.chap04.exercise0408;

import java.util.Scanner;

public class Exercise0408 {
    static int a[] = new int[10];
    static int b[] = new int[10];
    static int answer[] = new int[10];

    public static void makeQuiz() {
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
            b[i] = (int) (Math.random() * 100);
            answer[i] = a[i] + b[i];
            int index = i+1;
            System.out.println("Question \t" + index + " : " + a[i] + "\t+ " + b[i] + "\t=\t");
        }
    }

    public static int[] quizAdmin() {
        int[] inputNum = new int[10];

        for (int i = 0; i < 10; i++) {
            int index = i+1;
            System.out.print("Answer Of Question " + index + " = ");
            Scanner scanner = new Scanner(System.in);
            inputNum[i] = scanner.nextInt();
        }
        return inputNum;
    }

    public static int checkQuiz(int [] quizAnswer) {
        int count = 0;
        for(int i = 0; i< 10; i++){
            int index = i+1;
            if(quizAnswer[i] == answer[i]){
                count += 10;
            }
            else {
                System.out.println("Question " + index + " = " +a[i] + "\t+ " + b[i] + " = " +answer[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        makeQuiz();

        System.out.println(checkQuiz(quizAdmin()));
    }
}
