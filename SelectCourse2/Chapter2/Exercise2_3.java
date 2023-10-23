package Chapter2;

import java.util.Scanner;

public class Exercise2_3 {

    public static void inputUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name : ");
        String userName = sc.next();
        toUpperUserName(userName);

    }

    public static void toUpperUserName(String username) {
        String toUpperUserName = username.toUpperCase();
        printUserName(toUpperUserName);
    }

    public static void printUserName(String username) {
        System.out.println("\"Hello, " + username + ", nice to meet you!\"");
    }

    public static void main(String[] args) {
        inputUserName();
    }
}
