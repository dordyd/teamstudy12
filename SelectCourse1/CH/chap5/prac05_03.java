package SelectCourse1.CH.chap5;

import java.util.Scanner;

public class prac05_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (Double.compare(a, b) == 0 && Double.compare(b, c) == 0) {
            System.out.println("regular");
        } else if (Double.compare(a, b) == 0 || Double.compare(b, c) == 0 || Double.compare(a, c) == 0) {
            System.out.println("symmetric");
        } else {
            System.out.println("irregular");
        }
    }

}
