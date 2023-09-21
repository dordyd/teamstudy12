package chap5;

import java.util.Scanner;

public class Exercise0505 {

    // public static void whatIsIt(int a, int b, int c){
    //     int value = (int)Math.sqrt((int)Math.pow(b, 2) + (-4)*(a*c));
    //     if(value > 0){
    //         System.out.println("두근이요");
    //     }
    //     else if(value == 0){
    //         System.out.println("중근이요");
    //     }
    //     else if(value < 0){
    //         System.out.println("허근이요");
    //     }
    // }
    public static String numOfRootsDiscriminant(int a, int b, int c) {
        int value = (int) (b * b + (-4) * (a * c));
        int aResult = (int) ((-1 * b + Math.sqrt(value)) / 2 * a);
        int bResult = (int) ((-1 * b - Math.sqrt(value)) / 2) * a;
        if (value > 0) {
            return "result = " + aResult + ", " + bResult;
        } else if (value == 0) {
            return "result = " + aResult;
        } else {
            return "result = (-" + b + "+- " + "루트 " + Math.abs(value) + "i) / " + 2 * a;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        // whatIsIt(a, b, c);
        System.out.println(numOfRootsDiscriminant(1, 5, 7));
    }
}
