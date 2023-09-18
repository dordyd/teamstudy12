package SelectCourse1.CH.chap5;

import java.util.Scanner;

public class prac05_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double ansa = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        double ansb = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

        System.out.println(ansa + ", " + ansb);
    }
}
