package Unit7_Exercise;

public class Exercise07_4 {

    public static int[] matrixSumColumns(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] columnSums = new int[col];

        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += matrix[j][i];
            }
            columnSums[i] = sum;
        }

        return columnSums;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] columnSums = matrixSumColumns(matrix);

        for (int i = 0; i < columnSums.length; i++) {
            System.out.println("Sum of column " + i + ": " + columnSums[i]);
        }
    }
}
