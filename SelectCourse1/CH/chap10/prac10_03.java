package SelectCourse1.CH.chap10;

public class prac10_03 {
    public static void main(String[] args) {
        System.out.println(Ackermann(0, 1));
        System.out.println(Ackermann(3, 0));
        System.out.println(Ackermann(3, 2));
    }

    public static int Ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return Ackermann(m - 1, 1);
        } else {
            return Ackermann(m - 1, Ackermann(m, n - 1));
        }
    }
}
