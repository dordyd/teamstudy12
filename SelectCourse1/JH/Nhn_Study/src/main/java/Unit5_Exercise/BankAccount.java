package Unit5_Exercise;

public class BankAccount {

    private String name, surname;
    private double balance;

    public BankAccount(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.balance = 0;
    }

    public boolean sameOwner(BankAccount bankAccount) {
        return this.name.equals(bankAccount.name) && this.surname.equals(bankAccount.surname);
    }

    public void transferTo(BankAccount bankAccount, int val) {
        if (this.balance >= val) {
            this.withdraw(val);
            bankAccount.deposit(val);
        } else {
            System.out.println("It is not possible to withdraw " + val + "Euro from account " + this);
        }
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
