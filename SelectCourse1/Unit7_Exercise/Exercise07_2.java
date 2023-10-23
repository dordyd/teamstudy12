package Unit7_Exercise;

import java.util.Arrays;

public class Exercise07_2 {

    static int[] intersection(int[] A, int[] B) {

        int[] intersection = new int[Math.min(A.length, B.length)];
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    intersection[count] = A[i];
                    count++;
                    break;
                }
            }
        }

        return Arrays.copyOf(intersection, count);
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1};
        int[] B = {7, 1, 3, 4, 10, 11};

        int[] result = intersection(A, B);
        System.out.println(Arrays.toString(result));
    }
}
