package chap5;

import java.util.Scanner;

public class Exercise0501{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcoholContentG  = scanner.nextInt();
        if(alcoholContentG > 40){
            System.out.println("extra strong liquor");
        }
        else if(20 < alcoholContentG && alcoholContentG <=40){
            System.out.println("strong liquor");
        }
        else if(15 < alcoholContentG && alcoholContentG <=20){
            System.out.println("liquor");
        }
        else if(12 < alcoholContentG && alcoholContentG <=15){
            System.out.println("strong vine");
        }
        else if(10.5 < alcoholContentG && alcoholContentG <=12){
            System.out.println("normal vine");
        }
        else
            System.out.println("light vine");
    }
}