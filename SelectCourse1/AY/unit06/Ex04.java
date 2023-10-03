import java.util.Scanner;

public class Ex04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

      

        int positiveSum = 0;
        int negativeSum = 0;


        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num > 0) {
                positiveSum += num;
            } else if (num < 0) {
                negativeSum += num;
            }
        }

        System.out.println(positiveSum);
        System.out.println(negativeSum);

        scanner.close();
    }
}
