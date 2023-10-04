package Unit10_Exercise;

public class Example {
    public static int countChars(String s, char c) {
        if (s.length() == 0) {
            return 0;
        } else if (s.charAt(0) == c) {
            return 1 + countChars(s.substring(1), c);
        } else {
            return countChars(s.substring(1), c);
        }
    }

    public static void main(String[] args) {
        System.out.println(countChars("CAABBC", 'A'));
    }
}
