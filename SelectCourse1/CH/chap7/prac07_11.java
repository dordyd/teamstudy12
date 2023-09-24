package SelectCourse1.CH.chap7;

public class prac07_11 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
        System.out.println(diagonal(arr));
        int[][] arr1 = { { 1, 1, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 1, 0, 0, 1 } };
        System.out.println(diagonal(arr1));
    }

    public static boolean diagonal(int[][] M) {
        boolean isDiagonal = true;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == j)
                    continue;
                if (M[i][j] != 0) {
                    isDiagonal = false;
                }
            }
        }
        return isDiagonal;
    }

}
