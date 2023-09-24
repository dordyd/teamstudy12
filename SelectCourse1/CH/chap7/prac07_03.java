package SelectCourse1.CH.chap7;

import java.util.Arrays;

public class prac07_03 {
    public static void main(String[] args) {
        double[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        double[][] ans = transposeMatrix(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static double[][] transposeMatrix(double[][] M) {
        double[][] ans = new double[M[0].length][M.length];
        for (int i = 0; i < M[0].length; i++) {
            for (int j = 0; j < M.length; j++) {
                ans[i][j] = M[j][i];
            }
        }
        return ans;
    }
}
