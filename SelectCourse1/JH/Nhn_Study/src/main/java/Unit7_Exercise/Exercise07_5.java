package Unit7_Exercise;

import java.util.Arrays;

public class Exercise07_5 {

    public static boolean equalArrays(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] B = {1, 2, 3, 4};
        int[] C = {1, 2, 4, 2};

        System.out.println(equalArrays(A, B));
        System.out.println(equalArrays(A, C));

    }
}
