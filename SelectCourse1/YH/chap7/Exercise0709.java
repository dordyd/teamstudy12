package chap7;

public class Exercise0709 {
    // /A matrix M is said to be symmetric if it is square (i.e., has the same number of rows and
    // columns) and M[i][j] is equal to M[j][i], for each pair of valid indexes i and j. Write a predicate static
    // boolean symmetric(int[][] M) that returns true if the matrix M is symmetric, and false otherwise.
    public static boolean symmetric(int[][] M) {
        if (M.length != M[0].length) {
            return false;
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = i; j < M.length; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr =
                {{1, 2, 3, 2, 1},
                        {2, 3, 4, 3, 2},
                        {3, 4, 5, 4, 3},
                        {2, 3, 4, 3, 2},
                        {1, 2, 3, 2, 1}};

        int[][] arr2 =
                {{1, 2, 3, 4},
                        {2, 3, 4, 5}};

        int[][] arr3 =
                {{1, 2, 3, 2, 4},
                        {2, 3, 4, 3, 2},
                        {3, 4, 5, 4, 3},
                        {2, 3, 4, 3, 2},
                        {1, 2, 3, 2, 1}};

        System.out.println(symmetric(arr));
        System.out.println(symmetric(arr2));
        System.out.println(symmetric(arr3));
    }
}

