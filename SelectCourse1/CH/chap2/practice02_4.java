package SelectCourse1.CH.chap2;

import java.util.Scanner;

public class practice02_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String answer = input.substring(input.length()-1) + input.substring(1,input.length()-1) + input.substring(0, 1);
        System.out.println(answer);
    }
}
