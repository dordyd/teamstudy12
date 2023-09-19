package chap5;

import java.util.Scanner;

public class Exercise0506 {
    private static String solution(String str) {
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        StringBuilder sb = new StringBuilder();
        if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'){
            sb.append("MAYBE").append(' ');
        }

        if(lastChar == 'a' || lastChar == 'i' || lastChar == 'u'){
            sb.append("YES").append(' ');
        }
        else if(lastChar == 'e' || lastChar == 'o'){
            sb.append("NO").append(' ');
        }
        else
            sb.append("DON'T KNOW");
            
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}