public class Ex07 {
    
        public static void main(String[] args) {
            String input = "akmfkewn,c";
            char c = 'd';
            int position = findLongestConsecutiveChar(input, c);
    
            if (position != -1) {
                System.out.println( c + "is in: " + position);
            } else {
                System.out.println("not found in the string.");
            }
        }
    
        public static int findLongestConsecutiveChar(String input, char c) {
            int maxCount = 0; 
            int currentCount = 0; 
            int start=0;
            
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == c) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }
                } else {
                    currentCount = 0;
                }
            }
    
            if (maxCount == 0) {
                return -1; 
            } else {
                return start;
            }
        }
    }
    

