/*This exercise builds on Exercise 4.3. Every time you roll the dice repeatedly, trying to get a given total, 
the number of rolls it takes can be different. The question naturally arises, what's the average number of rolls to get a given total? 
Write a function that performs the experiment of rolling to get a given total 10000 times. The desired total is a parameter to the subroutine.
 The average number of rolls is the return value. Each individual experiment should be done by calling the function you wrote for Exercise 4.3.
  Now, write a main program that will call your function once for each of the possible totals (2, 3, ..., 12). It should make a table of the results,
   something like:

Total On Dice     Average Number of Rolls
-------------     -----------------------
       2               35.8382
       3               18.0607
       .                .
       .                .
*/

package SelectCourse2.Chap04;

public class Prac4_4 {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        System.out.printf("%10s%10s\n", "주사위의 총합", "평균 굴림 횟수");
        System.out.printf("%16s%16s\n", "--------------", "--------------");
        for (int i = 2; i < 13; i++) {
            System.out.printf("%10d%18.4f\n", i, avgCountOfTwoDiceSumSimulator(i));
        }

    }

    public static double avgCountOfTwoDiceSumSimulator(int userWantNum) {
        final int SIMULATION_COUNT = 10000;
        double sum = 0;
        for (int j = 0; j < SIMULATION_COUNT; j++) {
            sum += Prac4_3.predictNumber(userWantNum);
        }
        return sum / SIMULATION_COUNT;
    }
}
