package SelectCourse2.YH.code.chap08.exercise0801;

import java.util.Scanner;

public class Exercise0801 {
    /**
     * Returns the larger of the two roots of the quadratic equation
     * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
     * if the discriminant, B*B - 4*A*C, is negative, then an exception
     * of type IllegalArgumentException is thrown.
     */
    static public double root( double A, double B, double C )
            throws IllegalArgumentException {
        if (A == 0) {
            throw new IllegalArgumentException("A can't be zero.");
        }
        else {
            double disc = B*B - 4*A*C;
            if (disc < 0)
                throw new IllegalArgumentException("Discriminant < zero.");
            return  (-B + Math.sqrt(disc)) / (2*A);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Yes";

        do{
            try{
                System.out.print("A = ");
                double a = scanner.nextInt();
                System.out.print("B = ");
                double b = scanner.nextInt();
                System.out.print("C = ");
                double c = scanner.nextInt();
                System.out.println("result = " + root(a, b, c));

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                System.out.println("Do you want to again? (\"Yes\" or \"No\") ");
                answer = scanner.next();

            }

        }while(answer.equals("Yes"));


//        while(){
//            System.out.print("Do you want to again? (\"Yes\" or \"No\" ");
//            String answer =
//            try{
//
//                root();
//            }
//        }
    }
}
