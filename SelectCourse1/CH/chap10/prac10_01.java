package SelectCourse1.CH.chap10;

public class prac10_01 {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);

        }
    }
}