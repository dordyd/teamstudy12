package Chapter2;

import java.util.Scanner;

public class Exercise2_6 {

    private String name;
    private String lastName;

    Exercise2_6() {
    }

    Exercise2_6(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static Exercise2_6 insertUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name and last, separated by a space");
        System.out.print("? ");
        String name = sc.next();
        String lastName = sc.next();
        sc.close();
        return new Exercise2_6(name, lastName);
    }

    public int getNameLength() {
        return this.name.length();
    }

    public int getLastNameLength() {
        return this.lastName.length();
    }

    public String getInitial() {
        return this.name.charAt(0) + this.lastName.substring(0, 1);
    }

    public void print() {
        System.out.println("Your first name is " + this.name + ", which has " + getNameLength() + "characters");
        System.out.println("Your last name is " + this.lastName + ", which has " + getLastNameLength() + "characters");
        System.out.println("Your initials are " + getInitial());
    }

    public static void main(String[] args) {
        Exercise2_6 user1 = insertUserName();
        user1.print();
    }
}
