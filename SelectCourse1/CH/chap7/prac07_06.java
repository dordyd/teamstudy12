package SelectCourse1.CH.chap7;

public class prac07_06 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 2, 2, 5 };
        System.out.println(numberOfDuplicates(arr));
        System.out.println(numberOfDuplicates(arr1));
        System.out.println(numberOfDistincValues(arr1));
    }

    public static int numberOfDuplicates(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count != 0) {
            count++;
        }
        return count;
    }

    public static int numberOfDistincValues(int[] A) {
        int count = 0;
        boolean isNotDuplicate = false;
        for (int i = 0; i < A.length; i++) {
            isNotDuplicate = true;
            for (int j = 0; j < A.length; j++) {
                if (i == j)
                    continue;

                if (A[i] == A[j]) {
                    isNotDuplicate = false;
                    break;
                }
            }
            if (isNotDuplicate) {
                count++;
            }
        }
        return count;
    }
}
