package Chapter5;

public class Exercise5_3 {

    static final int NUMBER_OF_EXPERIMENTS = 10000;

    private static PairOfDice dice = new PairOfDice();

    public static void main(String[] args) {
        simulator();
    }

    public static void simulator() {
        System.out.println("Dice Total   Avg # of Rolls   Stand # Deviation   Max # of Rolls");
        System.out.println("----------   --------------   -----------------   --------------");

        for (int targetNum = 2; targetNum <= 12; targetNum++) {
            StatCalc stats = new StatCalc();
            for (int i = 0; i < NUMBER_OF_EXPERIMENTS; i++) {
                stats.enter(rollCount(targetNum));
            }
            System.out.printf("%8d", targetNum);
            System.out.printf("%15.3f", stats.getMean());
            System.out.printf("%20.3f", stats.getStandardDeviation());
            System.out.printf("%20.3f", stats.getMax());
            System.out.println();
        }
    }

    public static int rollCount(int targetNum) {
        int rollCount = 0;
        do {
            dice.roll();
            rollCount++;
        } while (dice.getDie1() + dice.getDie2() != targetNum);

        return rollCount;
    }
}
