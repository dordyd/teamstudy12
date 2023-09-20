public class Ex03 {
    public static void main(String[] args) {
        int n = 5; 
        long factorial = calFactorial(n);

        if (factorial != -1) {
            System.out.println( factorial);
        }
    }

    public static long calFactorial(int n) {
        if (n < 0) {
            System.out.println("negative number.");
            return -1;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
