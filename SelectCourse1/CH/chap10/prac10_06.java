package SelectCourse1.CH.chap10;

public class prac10_06 {
    public static void main(String[] args) {
        System.out.println(longSequence("abcdeffsaffffee", 'f', 0, 0));
    }

    public static int longSequence(String s, char c, int count, int max) {
        if (s.length() == 0) {
            return max;
        } else if (s.charAt(0) == c) {
            if (count + 1 > max) {
                max = count + 1;
            }
            return longSequence(s.substring(1), c, count + 1, max);
        } else {
            return longSequence(s.substring(1), c, 0, max);
        }
    }
}
