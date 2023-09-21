package chap6;

public class Exercise0611 {
    public static boolean isTrue(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isTrue(4));
    }
}
