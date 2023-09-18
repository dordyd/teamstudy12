import java.util.Scanner;


public class Exercise_03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = scanner.nextInt(); 
        int num2 = scanner.nextInt();

       
        double arithmeticMean = (double) (num1 + num2) / 2;
         System.out.println("Arithmetic Mean: " + arithmeticMean);

       
         double geometricMean = Math.sqrt((double) (num1 * num2));
         System.out.println("Geometric Mean: " + geometricMean);

        int greater = Math.max(num1, num2);
         int smaller = Math.min(num1, num2);

        System.out.println("Greater Number: " + greater);
        System.out.println("Smaller Number: " + smaller);

        
        scanner.close();
    }
}

