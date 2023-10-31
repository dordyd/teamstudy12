package SelectCourse2.YH.code.chap08.exercise0804;

import java.util.Scanner;

public class Exercise0804 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1;
        Expr expr1;
        boolean again1 = true;
        while (again1) {
            try {
                str1 = scanner.nextLine();
                expr1 = new Expr(str1);
                again1 = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }


}
