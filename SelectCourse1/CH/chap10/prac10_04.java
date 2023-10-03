package SelectCourse1.CH.chap10;

public class prac10_04 {
    public static void main(String[] args) {
        System.out.println(gcd(6, 18));
        System.out.println(isPrime(7, 3));
        System.out.println(rest(24, 18));
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static boolean isPrime(int x, int y) {
        if (x == 1 || y == 1) {
            return true;
        } else if (x == y) {
            return false;
        } else if (x < y) {
            return isPrime(x, y - x);
        } else {
            return isPrime(x - y, y);
        }
    }

    public static int rest(int x, int y) {
        if (x < 0) {
            return rest(x + y, y);
        } else if (0 <= x && x < y) {
            return x;
        } else {
            return rest(x - y, y);
        }
    }
}
