package SelectCourse2.YH.code.chap04;

/**
 * This exercise builds on Exercise 4.3.
 * Every time you roll the dice repeatedly, trying to get a given total, the number of rolls it takes can be different.
 * The question naturally arises, what's the average number of rolls to get a given total?
 * Write a function that performs the experiment of rolling to get a given total 10000 times.
 * The desired total is a parameter to the subroutine.
 * The average number of rolls is the return value.
 * Each individual experiment should be done by calling the function you wrote for Exercise 4.3. Now, write a main program that will call your function once for each of the possible totals (2, 3, ..., 12). It should make a table of the results, something like:
 *
 * Total On Dice     Average Number of Rolls
 * -------------     -----------------------
 *        2               35.8382
 *        3               18.0607
 *        .                .
 *        .                .
 */
public class Exercise0404 {
    public static final int TRYROLL = 10000;

    public static double predictDiceAverage(int predict){
        double sum = 0.000;
        for(int i = 0; i<TRYROLL; i++){
            sum += Exercise0403.predictNumber(predict);
        }

        return sum / TRYROLL;
    }

    public static void averagePrintAll(){
        System.out.println("주사위 총합  |   평균 굴림 횟수");
        for(int i = 2; i<=12; i++){
            System.out.print("\t" + i + "\t -> \t" + predictDiceAverage(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        averagePrintAll();
    }
}
