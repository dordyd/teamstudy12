package chap10;

public class Exercise1006 {
    public static int charCount(String str, char c ,int count, int maxcount){
        if(maxcount < count){
            maxcount = count;
        }
        if(str.equals("")){
            
            return maxcount;
        }
        if(str.equals("")){
            return maxcount;
        }
        else if(str.charAt(0) == c){
            count++;
            return charCount(str.substring(1), c, count, maxcount);
        }
        else{
            count = 0;
            return charCount(str.substring(1), c, count, maxcount);
        }
    }

    public static int solution(String str, char c){
        return charCount(str, c, 0, 0);
    }

    public static void main(String[] args) {
        String str = "wwweeewwwwweewwwwwww";
        System.out.println(solution(str, 'w'));
    }
}
