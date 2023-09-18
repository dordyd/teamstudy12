package SelectCourse1.CH.chap5;

import java.util.Scanner;

public class prac05_02 {
    public static void main(String[] args) {
        int equals = 0;
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (Double.compare(a, b) == 0)
            equals++;
        if (Double.compare(b, c) == 0)
            equals++;
        if (Double.compare(a, c) == 0)
            equals++;

        if (equals == 0) {
            System.out.println("irregular");
        } else if (equals == 1) {
            System.out.println("symmetric");
        } else {
            System.out.println("regular");
        }
    }
}
