package chap7;

public class Exercise0710 {
    //     A matrix M is said to be lower triangular if all elements M[i][j] with i<j (i.e., that are
// ”above” the main diagonal) are equal to 0. Write a predicate static boolean lowerTriangular(int[][] M)
// that returns true if the matrix M is lower triangular, and false otherwise.
    public static boolean lowerTriangular(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 0}, {2, 3, 0}, {4, 5, 6}};
        System.out.println(lowerTriangular(matrix1));

        int[][] matrix2 = {{1, 2}, {3, 4}};
        System.out.println(lowerTriangular(matrix2));
    }
}
