package Unit4_Exercise;

public class Exercise04_10 {

    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        String s = "Nhn_Academy";
        System.out.println(lastCharacter(s));
    }
}
