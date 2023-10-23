package Unit7_Exercise;

public class Exercise07_11 {


    public static boolean diagonal(int[][] M) {
        int row = M.length;
        int col = M[0].length;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i != j && M[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] diagonalMatrix1 = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        };

        int[][] diagonalMatrix2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] nonDiagonalMatrix = {
                {1, 2, 3},
                {0, 4, 5},
                {0, 0, 6}
        };


        System.out.println(diagonal(diagonalMatrix1));
        System.out.println(diagonal(diagonalMatrix2));
        System.out.println(diagonal(nonDiagonalMatrix));

    }
}
