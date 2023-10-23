import java.util.Scanner;
import java.util.Random;

public class Ex08 {
    public static void randomQuiz(int a[], int b[]) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(100);
            ;
            b[i] = random.nextInt(100);
            ;
        }
    }

    public static boolean testQuiz(int[] a, int[] b, int[] ans) {
        for (int i = 0; i < 10; i++) {
            if (ans[i] == (a[i] + b[i]))
                return true;
        }
        return false;
    }

    public static void countScore(int a[], int b[], int ans[]) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (testQuiz(a, b, ans))
                sum += 10;
        }
        System.out.println("Score : " + sum);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] ans = new int[10];
        Scanner sc = new Scanner(System.in);

        randomQuiz(a, b);
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i] + " + " + b[i] + " = ");
            ans[i] = sc.nextInt();
        }
        countScore(a, b, ans);

        sc.close();

    }
}
