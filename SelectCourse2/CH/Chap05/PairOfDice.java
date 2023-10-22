package SelectCourse2.CH.Chap05;

public class PairOfDice {

    private int die1;
    private int die2;

    public PairOfDice() {
        roll();
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return "dice 1 : " + die1 + " dice 2 : " + die2;
    }

    public int diceSum() {
        return die1 + die2;
    }

    public static void main(String[] args) {
        PairOfDice p = new PairOfDice();
        int count = 0;
        int sum = 0;
        while (sum != 2) {
            p.roll();
            sum = p.diceSum();
            count++;

            System.out.println(count);
        }

    }
}
