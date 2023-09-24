public class Ex04 {
    public static int[] matrixSumColumns(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[] columnSums = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            int sum = 0;
            for (int i = 0; i < numRows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }

        return columnSums;
    }}