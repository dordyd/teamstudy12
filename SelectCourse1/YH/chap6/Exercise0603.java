package chap6;

public class Exercise0603 {
    public static int factorial(int n) {
        if (n <= 0) {
            System.out.println("number is negative");
            return -1;
        }
        int result = 1;
        ;
        for (int i = 1; i < n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(-10));
    }
}
