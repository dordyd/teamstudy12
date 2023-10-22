package SelectCourse2.CH.Chap05;

public class prac5_3 {
    public static PairOfDice p = new PairOfDice();

    public static int twoDiceSumSimulator(int i) {
        int count = 0;
        while (i != p.diceSum()) {
            p.roll();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        for (int i = 2; i <= 12; i++) {
            StatCalc s = new StatCalc();
            for (int j = 0; j < 10000; j++) {
                s.enter(twoDiceSumSimulator(i));
            }
            System.out.println(i);
            System.out.println(s.getMean());
            System.out.println(s.getStandardDeviation());
            System.out.println(s.getMax());
        }
    }
}
