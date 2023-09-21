package chap6;

public class Exercise0607 {
    public static int longestSequence(String s, char c) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int position = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                if (count > max) {
                    max = count;
                    position = i - count + 1;
                }
            } else {
                count = 0;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println(longestSequence("iiiillliilllli", 'p'));
    }
}
