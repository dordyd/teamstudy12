package Unit6_Exercise;

import java.util.Scanner;

public class Exercise06_10 {

    public static void factorial(int inputNum) {
        int result = 1;
        if (inputNum < 0) {
            System.out.println("입력한 값이 0보다 작습니다.");
        } else {

            for (int i = 1; i <= inputNum; i++) {
                result *= i;
            }
        }
        System.out.println(result);
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for (int i = 1; i <= inputNum; i++) {
            factorial(i);
        }
    }

    public static void main(String[] args) {
        input();

    }
}
