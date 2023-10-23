package Chapter5;

public class PairOfDice {

    private int die1;   // Number showing on the first die.
    private int die2;   // Number showing on the second die.

    public PairOfDice() {
        // Constructor.  Rolls the dice, so that they initially
        // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }

    public PairOfDice(int val1, int val2) {
        if (val1 < 1 || val1 > 6 || val2 < 1 || val2 > 6) {
            throw new IllegalArgumentException("Both dice values must be between 1 and 6.");
        } else {
            die1 = val1;
            die2 = val2;
        }
    }

    public void roll() {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public int rollCount() {
        int rollcount = 0;
        do {
            roll();
            rollcount++;
        } while (die1 != die2);
        return rollcount;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public String toString() {
        if (die1 == die2) {
            return "Double " + die1;
        } else {
            return die1 + " and " + die2;
        }
    }

    public static void main(String[] args) {
        PairOfDice dice1 = new PairOfDice();
//        Exercise5_1 dice2 = new Exercise5_1(1, 13);
        PairOfDice dice2 = new PairOfDice(3, 6);

        do {
            System.out.println(dice2);
            dice2.roll();
        } while (dice2.getDie1() != dice2.getDie2());
        System.out.println(dice2);


    }

}