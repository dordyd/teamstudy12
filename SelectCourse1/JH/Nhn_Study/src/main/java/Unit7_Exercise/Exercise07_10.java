package Unit7_Exercise;

public class Exercise07_10 {

    public static boolean lowerTriangular(int[][] M) {
        int row = M.length;
        int col = M[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                if (M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] lowerTriangularMatrix1 = {
                {1, 0, 0},
                {2, 3, 0},
                {4, 5, 6}
        };

        int[][] lowerTriangularMatrix2 = {
                {1, 0, 0, 0},
                {2, 2, 0, 0},
                {4, 3, 9, 0},
                {7, 8, 9, 11}
        };


        int[][] nonLowerTriangularMatrix = {
                {1, 2, 3},
                {0, 4, 5},
                {0, 0, 6}
        };

        System.out.println(lowerTriangular(lowerTriangularMatrix1));
        System.out.println(lowerTriangular(lowerTriangularMatrix2));
        System.out.println(lowerTriangular(nonLowerTriangularMatrix));
    }
}
