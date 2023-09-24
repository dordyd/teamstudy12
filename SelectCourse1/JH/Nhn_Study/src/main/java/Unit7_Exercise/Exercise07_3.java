package Unit7_Exercise;

public class Exercise07_3 {

    static double[][] transposeMatrix(double[][] M) {

        int row = M.length;
        int col = M[0].length;

        double[][] result = new double[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = M[i][j];
            }
        }

        return result;

    }

    public static void main(String[] args) {

        double[][] M = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };

        double[][] result = transposeMatrix(M);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
