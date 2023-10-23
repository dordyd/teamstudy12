package Chapter2;

import java.util.Scanner;

public class Exercise2_4 {

    public static void inputExchange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert your Quarter : ");
        int quarter = sc.nextInt();
        System.out.print("Insert your Dime : ");
        int dime = sc.nextInt();
        System.out.print("Insert your Nickel : ");
        int nickel = sc.nextInt();
        System.out.print("Insert your Penny : ");
        int penny = sc.nextInt();

        chageToDollar(quarter, dime, nickel, penny);

    }

    public static void chageToDollar(int quarter, int dime, int nickel, int penny) {
        int cent = penny + 5 * nickel + 10 * dime + 25 * quarter;
        int dollar;
        if (cent >= 100) {
            dollar = cent / 100;
            cent = cent % 100;
            print(dollar, cent);
        } else {
            print(cent);
        }
    }

    public static void print(int dollar, int cent) {
        System.out.println(dollar + "Dollar " + cent + "Cent");
    }

    public static void print(int cent) {
        System.out.println(cent + "Cent");
    }

    public static void main(String[] args) {
        inputExchange();
    }
}
