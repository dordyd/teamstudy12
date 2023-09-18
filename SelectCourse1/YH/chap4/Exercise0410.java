package chap4;

public class
Exercise0410 {
    public static char lastCharacter(String s){
        return s.charAt(s.length()-1);
    }
    public static void main(String[] args) {
        String s = "12jofighting";

        System.out.println(lastCharacter(s));
    }
    
}
