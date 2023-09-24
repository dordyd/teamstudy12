package chap7;

// Exercise 7.1. Write a method static double scalarProduct(double[] A, double[] B) that calculates
// the scalar product of two arrays A and B, assuming they have the same length. We recall that the scalar product
// of A and B is obtained as the sum of the products A[i]*B[i], for all i, with 0 ≤ i < A.length.
public class Exercise0701 {
    public static double scalarProduct(double[] A, double[] B) {
        double result = 0;
        for (int i = 0; i < A.length; i++) {
            result = result + A[i] * B[i];
        }

        return result;


    }

    public static void main(String[] args) {
        double[] arr1 = {1, 2, 3, 4, 5};
        double[] arr2 = {6, 7, 8, 9, 10};

        System.out.println(scalarProduct(arr1, arr2));
    }
}