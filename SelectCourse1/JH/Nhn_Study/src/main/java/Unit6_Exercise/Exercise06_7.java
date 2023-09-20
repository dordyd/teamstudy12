package Unit6_Exercise;

public class Exercise06_7 {

    public static int findLongestConsecutiveCsPosition(String input, char c) {
        int maxLength = 0;  // 현재까지의 최대 연속 길이
        int currentLength = 0;  // 현재 연속 길이
        int position = -1;  // 현재까지의 최대 연속 'c'의 시작 위치
        int currentStart = -1;  // 현재 연속 'c'의 시작 위치

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == c) {
                if (currentStart == -1) {
                    currentStart = i;  // 연속 'c' 시퀀스 시작 위치 설정
                }
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    position = currentStart;  // 최대 연속 'c'의 시작 위치 업데이트
                }
            } else {
                currentStart = -1;  // 연속 'c' 시퀀스가 끊어짐
                currentLength = 0;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        String inputString = "abccccddeeeee";
        char c = 'c';
        int position = findLongestConsecutiveCsPosition(inputString, c);

        if (position != -1) {
            System.out.println(
                    "The position of the first character of the longest sequence of consecutive '" + c + "'s is: " +
                            position);
        } else {
            System.out.println("'" + c + "' does not occur in the string.");
        }
    }
}
