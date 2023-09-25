package chap7;

public class Exercise0704 {
    public static int sumOfRow(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result + a[i];
        }
        return result;
    }

    public static int[] matrixSumColums(int[][] a) {
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = sumOfRow(a[i]);
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] columnSums = matrixSumColums(matrix);

        System.out.println("Column Sums:");

        for (int sum : columnSums) {
            System.out.println(sum);
        }
    }
}
