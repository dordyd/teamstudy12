package chap6;

public class Exercise0606 {
    public static String encode(String text, int key){
        String str = "";
        char c;
        int ci;
        for(int i = 0; i<text.length(); i++){
            c = text.charAt(i);
            ci = (int)c;
            str += (char)(ci + key);
        }

        return str;
    }

    public static String decode(String encodeText, int key){
        String str = "";
        char c;
        int ci;
        for(int i = 0; i<encodeText.length(); i++){
            c = encodeText.charAt(i);
            ci = (int)c;
            str += (char)(ci -10);
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(encode("hello", 10));
        System.out.println(decode(encode("hello", 10), 10));
    }
    
}
