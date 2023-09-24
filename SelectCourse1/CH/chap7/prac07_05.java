package SelectCourse1.CH.chap7;

public class prac07_05 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 2, 2, 2, 2 };
        System.out.println(equalArrays(arr, arr1));
        System.out.println(equalArrays(arr, arr2));

    }

    public static boolean equalArrays(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                count++;
            }
        }
        return count == A.length;
    }

}
