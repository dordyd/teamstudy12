package Unit10_Exercise;

public class Exercise10_6 {

    private static int longestSequenceCountInS(String s, char c) {
        return longestSequenceCountInSHelper(s, c, 0, 0);
    }

    private static int longestSequenceCountInSHelper(String s, char c, int index, int count) {
        if (index == s.length()) {
            return count;
        }

        char compareChar = s.charAt(index);

        if (compareChar == c) {
            count++;
        } else {
            count = 0;
        }

        int nextCount = longestSequenceCountInSHelper(s, c, index + 1, count);

        return Math.max(count, nextCount);
    }

    public static void main(String[] args) {
        System.out.println(longestSequenceCountInS("ccacccbccccd", 'c'));
    }
}
