package chap6;

import java.util.Scanner;

public class Exercise0604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int positiveNum = 0;
        int negativeNum = 0;
        for(int i = 0; i<count; i++){
            int number = scanner.nextInt();
            if(number >= 0)
                positiveNum += number;
            else
                negativeNum += number;
        }

        System.out.println("positiveNim = " + positiveNum);
        System.out.println("negativeNim = " + negativeNum);

    }
}
