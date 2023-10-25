package SelectCourse2.CH.Chap05;

public class prac5_3 {
    static final int NUMBER_OF_EXPERIMENTS = 10000;

    public static PairOfDice p = new PairOfDice();

    public static int twoDiceSumSimulator(int i) {
        int count = 0;
        p.roll();
        while (i != p.diceSum()) {
            p.roll();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        for (int i = 2; i <= 12; i++) {
            StatCalc s = new StatCalc();
            for (int j = 0; j < NUMBER_OF_EXPERIMENTS; j++) {
                s.enter(twoDiceSumSimulator(i));
            }
            System.out.println(i);
            System.out.println(s.getMean());
            System.out.println(s.getStandardDeviation());
            System.out.println(s.getMax());
        }
    }
}
