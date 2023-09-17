package SelectCourse1.CH.chap4;

import java.util.Scanner;

public class prac04_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int arithmetic = (x+y)/2;
        int geometric = Math.sqrt(x*y);
        System.out.println(arithmetic);
        System.out.println(geometric);
        if(arithmetic > geometric){
            System.out.println(arithmetic + "is Bigger");
            System.out.println(geometric + "is Smaller");
        }
        else{
            System.out.println(geometric + "is Bigger");
            System.out.println(arithmetic + "is Smaller");
        }
    }
}
