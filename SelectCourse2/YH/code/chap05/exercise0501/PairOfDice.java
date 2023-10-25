package SelectCourse2.YH.code.chap05.exercise0501;

public class PairOfDice {
    private int die1, die2;

    public PairOfDice(){
        die1 = (int)(Math.random() * 6 ) + 1;
        die2 = (int)(Math.random() * 6 ) + 1;
    }

    public void roll(){
        die1 = (int)(Math.random() * 6 ) + 1;
        die2 = (int)(Math.random() * 6 ) + 1;
    }

    @Override
    public String toString() {
        return "die1 = " + die1 + ", die2 = " + die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public boolean equals(PairOfDice p) {
        return (this.die1 == p.die1) && (this.die2 == p.die2);
    }
}
