package chap7;

// Exercise 7.2. Write a method static int[] intersection(int[] A, int[] B) that returns a new array
// containing the intersection of two arrays A and B, i.e., exactly those elements that are present both in A and in
// B (independently of their position). We may assume that A and B do not contain duplicates, i.e., elements that
// appear more than once in the array.
public class Exercise0702 {
    public static int searchArraySize(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    count++;
                }
            }
        }

        return count;
    }

    public static Boolean searchArray(int[] arr, int t) {
        for (int i : arr) {
            if (i == t) {
                return true;
            }
        }
        return false;
    }

    public static int[] intersection(int[] A, int[] B) {
        int[] resultArr = new int[searchArraySize(A, B)];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (searchArray(B, A[i])) {
                resultArr[count++] = A[i];
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 5, 1, 8};

        int[] resultArr = intersection(arr1, arr2);

        for (int i : resultArr) {
            System.out.println(i);
        }
    }
}
