import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverse(input);
        System.out.println("Reversed: " + reversed);
      
        scanner.close();
    }

    public static String reverse(String input) {
  
        StringBuffer Buffer = new StringBuffer();
        Buffer.append(input.charAt(input.length() - 1));
   
        if (input.length() > 2) {
            Buffer.append(input.substring(1, input.length() - 1));
        }

        Buffer.append(input.charAt(0));

        return Buffer.toString();
    }
}
