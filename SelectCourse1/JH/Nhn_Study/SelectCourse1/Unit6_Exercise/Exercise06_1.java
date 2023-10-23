package Unit6_Exercise;

import java.util.Scanner;

public class Exercise06_1 {

    private static int[] arr;

    public static int solution() {
        int smallest = arr[0];
        for (int i = 1; i < 10; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(solution());

    }
}
