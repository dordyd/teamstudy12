public class Ex03 {
    public static int rollDice(int n) {
        if (n < 2 || n > 12)
            throw new IllegalArgumentException("too short or long");
        int dice1, dice2;
        int count = 0;
        int roll = 0;

        while (true) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            count++;
            roll = dice1 + dice2;
            if (roll == n)
                return count;
        }
    }

    public static void main(String[] args) {
        System.out.println("roll count = " + rollDice(11));
    }
}
