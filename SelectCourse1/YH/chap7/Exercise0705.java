package chap7;

public class Exercise0705 {
    public static boolean equalArrays(int[] A, int[] B) {
        if (A.length != B.length) {
            return false;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        int[] arr3 = {2, 3, 4, 5};
        int[] arr4 = {1, 2, 3};

        System.out.println(equalArrays(arr2, arr3));
        System.out.println(equalArrays(arr1, arr2));
        System.out.println(equalArrays(arr1, arr4));
    }
}
