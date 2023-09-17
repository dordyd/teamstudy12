package Unit4_Exercise;

public class Exercise04_4 {

    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(even(10));
    }
}
