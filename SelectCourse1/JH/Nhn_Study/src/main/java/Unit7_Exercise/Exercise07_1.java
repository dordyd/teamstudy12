package Unit7_Exercise;

public class Exercise07_1 {

    static double scalarProduct(double[] A, double[] B) {

        if (A.length != B.length) {
            throw new IllegalArgumentException("두 배열의 길이가 같아야 합니다");
        }

        double result = 0;
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[i];
        }

        return result;

    }

    public static void main(String[] args) {

        double[] A = {1, 2, 3};
        double[] B = {4.1, 5.2, 6.3};

        System.out.println(scalarProduct(A, B));

    }
}
