package Unit10_Exercise;

public class Exercise10_4 {

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            int r = x % y;
            return gcd(y, r);
        }
    }

    public static boolean prime(int x, int y) {
        if (x == 1 || y == 1) {
            return true;
        } else if (x < y) {
            return prime(x, y - x);
        } else if (x > y) {
            return prime(x - y, y);
        } else {
            return false;
        }
    }

    public static int rest(int x, int y) {
        if (x < 0) {
            return rest(x + y, y);
        } else if (x < y) {
            return x;
        } else {
            return rest(x - y, y);
        }
    }


    public static void main(String[] args) {
        System.out.println(gcd(48, 18));

        System.out.println(prime(21, 3));

        System.out.println(rest(11, 10));
    }
}
