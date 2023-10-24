package Chapter4;

public class Exercise4_3 {


    public static int throwDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // 두 주사위의 합이 given이 나올 때 까지 수행하여 count를 반환
    public static int count(int given) {
        if (given < 2 || given > 12) {
            throw new IllegalArgumentException("Impossible total for a pair of dice");
        }
        int count = 0;
        while (true) {
            int dice1 = throwDice();
            int dice2 = throwDice();
            count++;
            int sum = dice1 + dice2;
            if (sum == given) {
                break;
            }
        }
        return count;
    }

    public static int countSnakeEyes() {
        return count(2);
    }

    public static void main(String[] args) {
        System.out.println(count(12));
        System.out.println(countSnakeEyes());
    }
}
