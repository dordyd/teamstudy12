package SelectCourse1.CH.chap6;

public class prac06_06 {
    public static void main(String[] args) {
        System.out.println(decoding("defg", 3));
    }

    public static String decoding(String str, int code) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int ci = (int) c;
            ci -= code;
            c = (char) ci;
            result += c;
        }
        return result;
    }
}
