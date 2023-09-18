package SelectCourse1.CH.chap5;

import java.util.Scanner;

public class prac05_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        if (input > 40) {
            System.out.println("extra strong liquor");
        } else if (input > 20 && input <= 40) {
            System.out.println("strong liquor");
        } else if (input > 15 && input <= 20) {
            System.out.println("liquor");
        } else if (input > 12 && input <= 15) {
            System.out.println("strong vine");
        } else if (input > 10.5 && input <= 12) {
            System.out.println("normal vine");
        } else if (input <= 10.5) {
            System.out.println("light vine");
        }

    }
}
