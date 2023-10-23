public class ThePairOfDice {

    private int die1;
    private int die2;

    public ThePairOfDice() {

        roll();
    }

    public ThePairOfDice(int val1, int val2) {

        die1 = val1;
        die2 = val2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    public int sumofdice() {
        return getDie1() + getDie2();
    }

    public void roll() {

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return die1 + ", " + die2;
    }

    public static void main(String[] args) {
        ThePairOfDice dice = new ThePairOfDice();
        int count = 0;
        int sum = 0;

        while (sum != 2) {
            dice.roll();
            sum = dice.sumofdice();
            count++;
        }
        System.out.println(count);

    }

}