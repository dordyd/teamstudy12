package Unit6_Exercise;

public class Exercise06_5 {

    public static double calculatePi(int n) {
        double pi = 0.0;
        boolean subtract = false;

        for (int i = 1; i <= n; i += 2) {
            if (subtract) {
                pi -= 4.0 / i;
            } else {
                pi += 4.0 / i;
            }
            subtract = !subtract;
        }

        return pi;
    }

    public static void main(String[] args) {
        System.out.println(calculatePi(100000));
    }
}
