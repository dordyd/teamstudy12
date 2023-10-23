public class DicestatCalc {
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

    public static int rollForTotal(int n) {
        ThePairOfDice dice = new ThePairOfDice();
        int rolls = 0;
        int sum;

        do {
            dice.roll();
            sum = dice.sumofdice();
            rolls++;
        } while (sum != n);

        return rolls;
    }

    public static void enterDice(int roll) {
        for (int i = 2; i <= 12; i++) {
            StatCalc st = new StatCalc();
            for (int j = 0; j < NUMBER; j++) {
                st.enter(rollDice(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Total On Dice   Average Number   Stand Deviation   Max of Rolls");
        System.out.println("-------------   --------------   ----------------   ------------");
        for (int j = 2; j <= 12; j++) {
            int numberOfRolls = 0;
            int maxRolls = 0;
            StatCalc calc = new StatCalc();

            for (int i = 0; i < 10000; i++) {
                numberOfRolls += rollForTotal(j);
                maxRolls = Math.max(maxRolls, numberOfRolls);
                calc.enter(numberOfRolls);
            }
            System.out.printf("%6d", j);
            System.out.printf("%20f", calc.getMean());
            System.out.printf("%20f", calc.getStandardDeviation());
            System.out.printf("%20f", calc.getMax());
            System.out.println();

        }
    }
}
