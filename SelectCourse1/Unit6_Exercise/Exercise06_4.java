package Unit6_Exercise;

import java.util.Scanner;

public class Exercise06_4 {

    private static int[] integerSequence;

    private static void input() {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        integerSequence = new int[range];

        for (int i = 0; i < range; i++) {
            integerSequence[i] = sc.nextInt();
        }

    }

    public static int solution() {
        int result = 0;
        for (int i = 0; i < integerSequence.length; i++) {
            result += integerSequence[i];
        }
        return result;
    }

    public static void main(String[] args) {
        input();
        System.out.println(solution());
    }
}
