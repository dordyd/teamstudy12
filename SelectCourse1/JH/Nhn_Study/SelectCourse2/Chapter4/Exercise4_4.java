package Chapter4;

public class Exercise4_4 {
    public static double averageCount(int given) {
        int totalSum = 0;
        int SIMULATION_COUNT = 10000;
        for (int i = 0; i < SIMULATION_COUNT; i++) {
            totalSum += Exercise4_3.count(given);
        }
        return (double) totalSum / SIMULATION_COUNT;
    }

    public static void main(String[] args) {
        double averageCountTwo = averageCount(12);
        System.out.println(averageCountTwo);

    }
}
