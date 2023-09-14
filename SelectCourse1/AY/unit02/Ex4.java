import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
       
            String reversed = reverse(input);
            System.out.println("바꿈 :" + reversed);
      
        scanner.close();
    }

    public static String reverse(String input) {

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        String middle = input.substring(1, input.length() - 1);

        return lastChar + middle + firstChar;
    }
}
