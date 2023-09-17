package SelectCourse1.CH.chap4;

public class prac04_10 {
    public static char lastCharacter(String s){
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(lastCharacter("Example"));
    }
}
