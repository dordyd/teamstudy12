package Chapter5;

/**
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */

public class StatCalc {

    public static void main(String[] args) {
        StatCalc statCalc = new StatCalc();
        for (int i = 1; i <= 10; i++) {
            statCalc.enter(i);
        }
        System.out.println(statCalc.getStandardDeviation());
        System.out.println(statCalc.getMean());
    }

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.

    private double max;
    private double min;

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
    }

    public double getMax() {
        return this.max;
    }

    public double getMin() {
        return this.min;
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
        if (count <= 0) {
            throw new NumberFormatException("입력된 값이 없습니다.");
        }
        return sum / count;
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {
        if (count <= 0) {
            throw new NumberFormatException("입력된 값이 없습니다.");
        }
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }

}  // end class StatCalc