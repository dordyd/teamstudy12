package Chapter4;

public class Exercise4_4 {
    private static final int SIMULATION_COUNT = 10000;

    public static double averageCount(int given) {
        int totalSum = 0;
        for (int i = 0; i < SIMULATION_COUNT; i++) {
            totalSum += Exercise4_3.count(given);
        }
        return (double) totalSum / SIMULATION_COUNT;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 12; i++) {
            double averageCountTwo = averageCount(i);
            System.out.println(averageCountTwo);
        }

    }
}
