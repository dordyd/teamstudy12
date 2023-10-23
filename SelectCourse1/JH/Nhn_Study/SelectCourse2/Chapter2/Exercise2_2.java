package Chapter2;

public class Exercise2_2 {

    public static int throwDice() {
        return (int) ((Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        int firstThrow = throwDice();
        int secondThrow = throwDice();
        int sum = firstThrow + secondThrow;

        System.out.println("The first die comes up " + firstThrow);
        System.out.println("The second die comes up " + secondThrow);
        System.out.println("Your total roll is " + sum);

    }
}
