package SelectCourse1.CH.chap6;

public class prac06_07 {
    public static void main(String[] args) {
        System.out.println(sequence("abddeqwdwqd", 'c'));
        System.out.println(sequence("abcdeffffe", 'f'));
        System.out.println(sequence("adffddfffaaffffddde", 'f'));
    }

    public static int sequence(String str, char c) {
        int count = 0;
        int first = -1;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
                if (count > max) {
                    max = count;
                    first = i - count + 1;
                }

            } else {

                count = 0;
            }
        }
        return first;
    }
}
