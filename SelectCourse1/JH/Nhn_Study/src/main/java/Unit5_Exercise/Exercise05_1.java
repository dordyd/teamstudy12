package Unit5_Exercise;

import java.util.Scanner;

public class Exercise05_1 {

    public static void compareDrink(int g) {
        if (g > 40) {
            System.out.println("extra strong liquor");
        } else if (20 < g) {
            System.out.println("strong liquor");
        } else if (15 < g) {
            System.out.println("liquor");
        } else if (12 < g) {
            System.out.println("strong vine");
        } else if (10.5 < g) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcoholContent = sc.nextInt();
        compareDrink(alcoholContent);
    }
}
