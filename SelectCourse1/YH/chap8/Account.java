package chap8;

public class Account{
    String name;
    String firstName;
    int balance;
    
    public Account(String name, String firstName, int balance){
        this.name = name;
        this.firstName = firstName;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "name = " + name + ", firstName = " + firstName + ", balance = " + balance;
    }
}