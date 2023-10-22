package SelectCourse2.CH.Chap05;

import java.util.Scanner;

public class StatCalc {

    private int count; // Number of numbers that have been entered.
    private double sum; // The sum of all the items that have been entered.
    private double squareSum; // The sum of the squares of all the items.
    private double max = Double.MIN_VALUE;
    private double min = Double.MAX_VALUE;

    /**
     * Add a number to the dataset. The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
        if (num > max)
            max = num;
        if (num < min)
            min = num;
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public static void main(String[] args) {
        StatCalc s = new StatCalc();
        double input = 1;
        Scanner scan = new Scanner(System.in);
        while (input != 0) {
            input = scan.nextDouble();
            if (input != 0) {
                s.enter(input);
            }
        }
        System.out.println(s.getCount());
        System.out.println(s.getMean());
        System.out.println(s.getStandardDeviation());
        System.out.println(s.getSum());
        System.out.println(s.getMax());
        System.out.println(s.getMin());

    }

}