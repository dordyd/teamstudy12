package chap7;

public class Exercise0704 {
    public static int mostMaxValueInArrays(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(a[i], max);
        }
        return max;
    }

    public static int[] matrixSumColums(int[][] a) {
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = mostMaxValueInArrays(a[i]);
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
