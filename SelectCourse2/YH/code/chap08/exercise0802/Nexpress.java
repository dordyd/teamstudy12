package SelectCourse2.YH.code.chap08.exercise0802;

import java.math.BigInteger;
import java.util.Scanner;

public class Nexpress {

    public static void main(String[] args) {
        BigInteger bi;
        Scanner scanner = new Scanner(System.in);
        String str;
        do{
            try {
                str = scanner.nextLine();
                bi = new BigInteger(str);
                System.out.println(numberMulThrAddOne(bi));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }while("\n".equals(scanner.nextLine()));

    }

    public static BigInteger numberMulThrAddOne(BigInteger bi){
        BigInteger retInt = bi.multiply(new BigInteger("3")).add(new BigInteger("1"));

        return retInt;
    }
}
