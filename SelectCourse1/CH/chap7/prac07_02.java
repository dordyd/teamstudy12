package SelectCourse1.CH.chap7;

import java.util.Arrays;

public class prac07_02 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 3, 5 };
        int[] ans = interesection(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    public static int[] interesection(int[] A, int[] B) {
        // Arrays.sort(A);
        // Arrays.sort(B);
        int count = 0;
        int[] arr = new int[Math.min(A.length, B.length)];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    arr[count] = A[i];
                    count++;
                }
            }
        }
        return arr;
    }
}
