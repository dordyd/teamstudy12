package Unit6_Exercise;

public class Exercise06_7 {

    public static int findLongestConsecutivePosition(String input, char c) {
        int maxLength = 0;
        int currentLength = 0;
        int position = -1;
        int currentStart = -1;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == c) {
                if (currentStart == -1) {
                    currentStart = i;
                }
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    position = currentStart;
                }
            } else {
                currentStart = -1;
                currentLength = 0;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        String inputString = "abccccddeeeee";
        char c = 'c';
        int position = findLongestConsecutivePosition(inputString, c);

        if (position != -1) {
            System.out.println(c + "'s is: " + position);
        } else {
            System.out.println("'" + c + "' does not occur in the string.");
        }
    }
}
