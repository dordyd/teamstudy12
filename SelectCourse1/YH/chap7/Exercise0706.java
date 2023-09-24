package chap7;

import java.util.Arrays;

// A duplicate in an array is a value that appears more than once as element of the array. Write
// a method static int numberOfDuplicates(int[] A) that returns the number of distinct duplicates in the
// array A. Write also a method static int numberOfDistinctValues(int[] A) that returns the number of
// distinct values in the array A.
public class Exercise0706 {


    public static int numberOfDuplicates(int[] A) {
        int count = 0;
        boolean b = false;
        for (int i = 0; i < A.length - 1; i++) {
            int target = A[i];
            if (target != A[i + 1]) {
                target = A[i + 1];
                b = false;
            } else {
                if (b == false) {
                    count++;
                    b = true;
                }
            }
        }
        return count;
    }


    public static int numberOfDistinctValues(int[] A) {
        int count = 1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 3, 2, 4, 5, 3, 2, 6, 8, 8};
        Arrays.sort(array);
        int numDuplicates = numberOfDuplicates(array);

        System.out.println("Number of Duplicates: " + numDuplicates);

        int numDistinctValues = numberOfDistinctValues(array);

        System.out.println("Number of Distinct Values: " + numDistinctValues);
    }
}
