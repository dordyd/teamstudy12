public class Ex03 {
    static double[][] transposeMatrix(double[][] M) {
        int numRows = M.length;
        int numCols = M[0].length;

        double[][] transposed = new double[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposed[j][i] = M[i][j];
            }
        }

        return transposed;
    }
}
