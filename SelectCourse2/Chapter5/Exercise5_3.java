package Chapter5;

public class Exercise5_3 {

    static final int NUMBER_OF_EXPERIMENTS = 10000;

    private static PairOfDice dice = new PairOfDice();

    public static void main(String[] args) {
        System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
        System.out.println("----------   --------------   ----------------   --------------");

        for (int total = 2; total <= 12; total++) {
            StatCalc stats;  // An object that will compute the statistics.
            stats = new StatCalc();
            for (int i = 0; i < NUMBER_OF_EXPERIMENTS; i++) {
                stats.enter(rollFor(total));
            }
            System.out.printf("%6d", total);
            System.out.printf("%18.3f", stats.getMean());
            System.out.printf("%19.3f", stats.getStandardDeviation());
            System.out.printf("%14.3f", stats.getMax());
            System.out.println();
        }


    }

    public static int rollFor(int N) {
        int rollCt = 0;  // Number of rolls made.
        do {
            dice.roll();
            rollCt++;
        } while (dice.rollCount() != N);
        return rollCt;
    }
}
