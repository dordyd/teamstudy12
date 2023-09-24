package SelectCourse1.CH.chap7;

import java.util.Arrays;

public class prac07_08 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        System.out.println(mystery(A));
    }

    // 배열 안에있는 홀수의 수 계산해서 return
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1)
                x++;
        }
        return x;
    }
}
