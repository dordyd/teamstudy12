package chap7;

public class Exercise0711 {
    //     A matrix M is said to be diagonal if all elements M[i][j] with i different from j (i.e., that
// are not on the main diagonal) are equal to 0. Write a predicate static boolean diagonal(int[][] M) that
// returns true if the matrix M is diagonal, and false otherwise.
    public static boolean diagonal(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (i != j) {
                    if (M[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}};

        int[][] matrix2 = {{1, 1, 0}, {0, 2, 0}, {0, 0, 3}};
        System.out.println(diagonal(matrix1));
        System.out.println(diagonal(matrix2));
    }
}
