package SelectCourse1.CH.chap7;

public class prac07_01 {
    public static void main(String[] args) {
        double[] A = { 1, 2, 3, 4, 5 };
        double[] B = { 1, 2, 3, 4, 5 };
        System.out.println(scalarProdut(A, B));
    }

    static double scalarProdut(double[] A, double[] B) {
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }
        return sum;
    }
}