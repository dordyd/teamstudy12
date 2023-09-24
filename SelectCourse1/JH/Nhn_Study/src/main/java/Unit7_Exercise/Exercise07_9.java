package Unit7_Exercise;

public class Exercise07_9 {

    public static boolean symmetric(int[][] M) {
        int row = M.length;
        int col = M[0].length;

        if (row != col) {
            return false;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] symmetricMatrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        int[][] nonSymmetricMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(symmetric(symmetricMatrix));
        System.out.println(symmetric(nonSymmetricMatrix));
    }


}
