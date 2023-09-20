public class Ex06 {
        public static void main(String[] args) {
            String input = "dvknwv";
            int d = 1;
            String decodedString = decodeString(input, d);
    
            System.out.println("Original : " + input);
            System.out.println("Decoded : " + decodedString);
        }
    
        public static String decodeString(String input, int d) {
            StringBuilder decoded = new StringBuilder();
    
            for (char c : input.toCharArray()) {
                    char decodedChar = (char) (c - d);
                 
                }
            
            return decoded.toString();
        }
    }
    
    
