import java.util.Scanner;

public class Ex06 {
    private static AdditionQuestion[] ques;
    static int[] a = new int[10];
    static int[] b = new int[10];
    static int[] ans = new int[10];

    public static void randomQuiz(int a[], int b[]) {
        ques=new AdditionQuestion[10];
        for (int i = 0; i < 10; i++) {
            ques[i]=new AdditionQuestion();
        }
    }

    public static boolean testQuiz(int[] a, int[] b, int[] ans, int i) {
        if (ans[i] == ques[i].getCorrectAnswer())
            return true;

        return false;
    }

    public static void countScore(int a[], int b[], int ans[]) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (testQuiz(a, b, ans, i))
                sum += 10;
        }
        System.out.println("Score : " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        randomQuiz(a, b);
        for (int i = 0; i < 10; i++) {
            System.out.println(ques[i].getQuestion());
            ans[i] = sc.nextInt();
        }
        countScore(a, b, ans);

        sc.close();

    }
}


