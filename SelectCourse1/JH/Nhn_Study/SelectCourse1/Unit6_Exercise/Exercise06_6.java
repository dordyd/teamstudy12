package Unit6_Exercise;

public class Exercise06_6 {

    public static String solution(String input, int d) {

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char tmp = arr[i];
            tmp = (char) (tmp - d);
            arr[i] = tmp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(solution("I love you", 1));
    }
}
