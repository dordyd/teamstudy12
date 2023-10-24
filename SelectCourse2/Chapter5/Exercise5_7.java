package Chapter5;

import java.util.Scanner;

public class Exercise5_7 {

    public static void main(String[] args) {
        Exercise5_7 test1 = new Exercise5_7();
        test1.start();
    }

    private IntQuestion[] intQuestions;
    private int[] answerArr;
    private static final int QUESTION_COUNT = 10;
    private static final int POINT = 10;

    public void start() {
        createQuestion();
        administerQuestion();
        gradeQuestion();
    }

    public void createQuestion() {
        intQuestions = new IntQuestion[QUESTION_COUNT];
        for (int i = 0; i < 7; i++) {
            int option = ((int) (Math.random() * 2));
            switch (option) {
                case 0:
                    intQuestions[i] = new AdditionQuestion();
                    break;
                case 1:
                    intQuestions[i] = new SubtractionQuestion();
                    break;
                default:
                    throw new IllegalArgumentException("Option Error");
            }
        }
        intQuestions[7] = new IntQuestion() {
            public String getQuestion() {
                return "How many states are there in the United States? ";
            }

            public int getCorrectAnswer() {
                return 50;
            }
        };
        intQuestions[8] = new IntQuestion() {
            public String getQuestion() {
                return "In what year did the First World War begin? ";
            }

            public int getCorrectAnswer() {
                return 1914;
            }
        };
        intQuestions[9] = new IntQuestion() {
            public String getQuestion() {
                return "What is the answer to the ultimate question " +
                        "of life, the universe, and everything? ";
            }

            public int getCorrectAnswer() {
                return 42;
            }
        };
    }

    public void administerQuestion() {
        answerArr = new int[QUESTION_COUNT];

        for (int i = 0; i < QUESTION_COUNT; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Q" + (i + 1) + ". " + intQuestions[i].getQuestion());
            int answer = sc.nextInt();
            answerArr[i] = answer;
        }
        System.out.println("--------------------------");
    }

    public void gradeQuestion() {
        int correctCount = 0;

        for (int i = 0; i < QUESTION_COUNT; i++) {
            String question = intQuestions[i].getQuestion();
            int userAnswer = answerArr[i];
            int correctAnswer = intQuestions[i].getCorrectAnswer();

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

    public interface IntQuestion {
        public String getQuestion();

        public int getCorrectAnswer();
    }

    static class AdditionQuestion implements IntQuestion {
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

    static class SubtractionQuestion implements IntQuestion {

        private int a, b;

        public SubtractionQuestion() {
            a = (int) (Math.random() * 50 + 1);
            b = (int) (Math.random() * 50);
            if (b > a) {
                int temp = a;
                a = b;
                b = temp;
            }
        }

        @Override
        public String getQuestion() {
            return "What is " + a + " - " + b + " ? ";
        }

        @Override
        public int getCorrectAnswer() {
            return a - b;
        }
    }

}

