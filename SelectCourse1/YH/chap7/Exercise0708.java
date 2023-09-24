package chap7;

public class Exercise0708 { // 배열안에서 홀수의 갯수 세는 메서드
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                x++;
            }
        }
        return x;
    }
}
