import java.util.Scanner;

public class StatCalc {

    private int count;
    private double sum;
    private double squareSum;
    private double max = Double.NEGATIVE_INFINITY;
    private double min = Double.POSITIVE_INFINITY;

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
        StatCalc calc = new StatCalc(); // Object to process the data
        Scanner scanner = new Scanner(System.in);
        double num;

        do {
            num = scanner.nextDouble();
            if (num != 0) {
                calc.enter(num);
            }
        } while (num != 0);

        scanner.close();

        int count = calc.getCount();

        System.out.println("Count " + count);
        System.out.println("Sum " + calc.getSum());
        System.out.println("Standard Deviation " + calc.getStandardDeviation());
        System.out.println("Max " + calc.getMax());
        System.out.println("Min " + calc.getMin());
    }
}