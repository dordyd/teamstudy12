public class Ex04 {
    public static int NUMBER = 10000;

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

    public static double averageDice(int roll) {   
        int totalRolls = 0;
        for (int i = 0; i < NUMBER; i++) {
            totalRolls += rollDice(roll);
        }
        return (double) totalRolls / NUMBER;
    }

    public static void main(String[] args) {
        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%10d %22f\n", i + 1, averageDice(i));
        }
    }
}
