package Unit7_Exercise;

public class Exercise07_6 {

    public static int numberOfDuplicates(int[] A) {
        int result = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != -1) {
                int count = 0;

                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j]) {
                        count++;
                        A[j] = -1;
                    }
                }

                if (count >= 1) {
                    result++;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] B = {1, 3, 3, 4, 4, 4, 5, 6, 7, 7};

        System.out.println(numberOfDuplicates(B));
//        System.out.println(Arrays.toString(numberOfDistinctValue(B)));
    }

}
