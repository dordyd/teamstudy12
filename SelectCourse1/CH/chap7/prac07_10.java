package SelectCourse1.CH.chap7;

public class prac07_10 {
    public static void main(String[] args) {
        int[][] M = { { 1, 2, 3, 4, 5 }, { 0, 1, 2, 3, 4 }, { 0, 0, 1, 2, 3 }, { 0, 0, 0, 1, 2 }, { 0, 0, 0, 0, 1 } };
        System.out.println(lowerTriangular(M));

        int[][] M2 = { { 1, 2, 3, 4, 5 }, { 0, 1, 2, 3, 4 }, { 0, 0, 1, 2, 3 }, { 1, 0, 0, 1, 2 }, { 1, 0, 0, 0, 1 } };
        System.out.println(lowerTriangular(M2));

    }

    public static boolean lowerTriangular(int[][] M) {
        boolean islowerTriangular = true;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] != 0)
                    islowerTriangular = false;
            }
        }
        return islowerTriangular;
    }
}
