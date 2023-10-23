package Unit4_Exercise;

public class BankAccount {

    private String name, surname;
    private double balance;

    public BankAccount(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.balance = 0;
    }

    public void deposit(double val) {
        balance = balance + val;
    }

    public void withdraw(double val) {
        balance = balance - val;
    }

    public String toString() {
        return "{ Owner: " + name + " " + surname +
                " - Balance: Euro " + balance + " }";
    }


}
