package SelectCourse1.CH.chap10;

import java.util.Arrays;

public class prac10_02 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = fibonacci(5, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int fibonacci(int n, int[] arr) {
        arr[1]++;
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 2, arr) + fibonacci(n - 1, arr);
        }
    }
}
