package Unit4_Exercise;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount("Mario", "Rossi");
        System.out.println("Before the operations : " + ba);
        ba.deposit(1000);
        ba.withdraw(100);
        System.out.println("After the operations : " + ba);

    }
}
