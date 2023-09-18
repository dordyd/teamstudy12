public class Exercise_10 {

    public static char lastCharacter(String s) {

            return s.charAt(s.length() - 1);
        
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        
        
            char lastCh = lastCharacter(input);
            System.out.println("Last character " + lastCh);
        
    }
}

