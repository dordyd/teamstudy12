package SelectCourse2.YH.code.chap05.exercise0506;

import java.util.Scanner;

public class AdditionQuestion {
    private int a, b;
    public static int[] answer = new int[10];
    public static AdditionQuestion[] additionQuestion = new AdditionQuestion[10];
    public AdditionQuestion(){
        a = (int)(Math.random()*50 +1);
        b = (int)(Math.random()*50);
    }

    public String getQuenstion(){
        return "what is " +a + " + " + b + " ?";
    }

    public int getCorrectAnswer(){
        return a + b;
    }
    public static void makeQuiz() {
        for (int i = 0; i < 10; i++) {
            additionQuestion[i] = new AdditionQuestion();
            System.out.println(additionQuestion[i].getQuenstion());
        }
    }

    public static void quizAdmin() {
        for (int i = 0; i < 10; i++) {
            int index = i+1;
            System.out.print("Answer Of Question " + index + " = ");
            Scanner scanner = new Scanner(System.in);
            answer[i] = scanner.nextInt();
        }
    }

    public static int checkQuiz() {
        int count = 0;
        for(int i = 0; i< 10; i++){
            int index = i+1;
            if(answer[i] == additionQuestion[i].getCorrectAnswer()){
                count += 10;
            }
            else {
                System.out.println(additionQuestion[i].getCorrectAnswer());
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
