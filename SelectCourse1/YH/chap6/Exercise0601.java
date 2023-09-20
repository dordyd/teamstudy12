package chap6;

import java.util.Scanner;

public class Exercise0601{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<10; i++ ){
            int s = scanner.nextInt();

            if(max < s){
                max = s;
            }
        }

        System.out.println(max);
    }
}