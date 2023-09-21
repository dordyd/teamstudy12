package chap6;

public class Exercise0609 {
    public static void main(String[] args) {
        triangle(9);
    }

    private static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                if (j > i) {
                    System.out.print(number--);
                } else {
                    System.out.print(number++);
                }
            }
            System.out.println();
        }
    }
}

//공백  숫자  줄
//3    1    0
//2    3    1
//1    5    2
//0    7    3
