package SelectCourse1.CH.chap7;

public class prac07_09 {
    public static void main(String[] args) {
        int[][] M = { { 1, 2, 3 }, { 2, 1, 2 }, { 3, 2, 1 } };
        int[][] M2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(symmetric(M));
        System.out.println(symmetric(M2));
    }

    public static boolean symmetric(int[][] M) {
        boolean isSymmetric = true;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] != M[j][i]) {
                    isSymmetric = false;
                }
            }
        }

        return isSymmetric;
    }
}
