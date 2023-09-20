import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest=99999;

        for (int i = 1; i <= 10; i++) {
           
            int currentNumber = scanner.nextInt();

            if (currentNumber < smallest) {
                smallest = currentNumber;
            }
        }

        System.out.println("The smallest integer is: " + smallest);

        scanner.close();
    }
}
