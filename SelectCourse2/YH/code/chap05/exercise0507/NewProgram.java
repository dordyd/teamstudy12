package SelectCourse2.YH.code.chap05.exercise0507;

import java.util.Scanner;

public class NewProgram {

    private static IntQuestion[] intQuestions = new IntQuestion[3];
    private static int answer[] = new int[3];

    public static void makeQuiz() {
        intQuestions[0] = new IntQuestion() {
            @Override
            public String getQuestion() {
                return "내 나이는?";
            }

            @Override
            public int getCorrectAnswer() {
                return 25;
            }

        };
        intQuestions[1] = new IntQuestion() {
            @Override
            public String getQuestion() {
                return "내가 태어난 연도는?";
            }

            @Override
            public int getCorrectAnswer() {
                return 1999;
            }

        };
        intQuestions[2] = new IntQuestion() {
            @Override
            public String getQuestion() {
                return "내 생일은? (ex, 1월 1일인경우 : 0101)";
            }

            @Override
            public int getCorrectAnswer() {
                return 1201;
            }

        };
        for (int i = 0; i < 3; i++) {
            System.out.println(intQuestions[i].getQuestion());
        }
    }

    public static void quizAdmin() {
        for (int i = 0; i < 3; i++) {
            int index = i + 1;
            System.out.print("Answer Of Question " + index + " = ");
            Scanner scanner = new Scanner(System.in);
            answer[i] = scanner.nextInt();
        }
    }

    public static int checkQuiz() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int index = i + 1;
            if (answer[i] == intQuestions[i].getCorrectAnswer()) {
                count += 10;
            } else {
                System.out.println("Question " + index + " = " + intQuestions[i].getCorrectAnswer());
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
