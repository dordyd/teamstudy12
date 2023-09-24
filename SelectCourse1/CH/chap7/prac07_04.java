package SelectCourse1.CH.chap7;

import java.util.Arrays;

public class prac07_04 {
    public static void main(String[] args) {
        int[][] arr = { { 2, 2 }, { 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2, 2 } };
        int[] ans = MatrixSumColumns(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] MatrixSumColumns(int[][] a) {
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                ans[i] += a[i][j];
            }
        }

        return ans;
    }
}
