package chap5;

import java.util.Scanner;

public class Exercise0502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number thrre times: ");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        
        int count = 0;
        
        if(a == b){
            count ++;
        }
        if(b == c){
            count ++;
        }
        if(c == a){
            count ++;
        }

        if(count == 0){
            System.out.println("it is irregular");
        }
        else if(count == 1){
            System.out.println("it is symmetric");
        }
        else
            System.out.println("it is regular");
        
    }
}
