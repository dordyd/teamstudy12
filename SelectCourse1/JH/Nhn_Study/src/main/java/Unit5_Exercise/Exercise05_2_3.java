package Unit5_Exercise;

import java.util.Scanner;

public class Exercise05_2_3 {

    private static int[] sideArr;

    public static void compareSides(int[] arr) {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Irregular");
        } else if (count == 1) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Regular");
        }
    }

    private static void input() {
        sideArr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            sideArr[i] = sc.nextInt();
        }
        compareSides(sideArr);
    }

    public static void main(String[] args) {

        input();

    }
}
