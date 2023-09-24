package chap7;

import java.util.Arrays;

public class Exercise0707 {
    //     Write a method static int[] removeDuplicates(int[] A) that returns a new array obtained from A by removing all duplicates. The duplicates should be removed by keeping only the first occurrence
// of each distinct element, and shifting remaining elements upwards when a duplicate is removed.
    public static int[] removeDuplicates(int[] A) {
        int[] resultArr = new int[Exercise0706.numberOfDistinctValues(A)];
        resultArr[0] = A[0];
        int p = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                resultArr[p++] = A[i];
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 2, 6, 8, 8};
        Arrays.sort(array);

        int[] resultArr = removeDuplicates(array);
        for (int i : resultArr) {
            System.out.println(i);
        }
    }

}
