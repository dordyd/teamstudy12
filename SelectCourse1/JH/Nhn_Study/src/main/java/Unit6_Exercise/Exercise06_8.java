package Unit6_Exercise;

public class Exercise06_8 {

    public static void solution() {
        int n = 9;

        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();


        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
