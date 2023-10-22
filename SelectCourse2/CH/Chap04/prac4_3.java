package SelectCourse2.CH.Chap04;

public class prac4_3 {
    public static void main(String[] args) {
        System.out.println(twoDiceSumSimulator(2));
    }

    public static int twoDiceSumSimulator(int userWantNum) {
        if (userWantNum < 2 || userWantNum > 12) {
            throw new IllegalArgumentException("주사위 합은 2 < sum < 12");
        }

        int randDiceNum1 = (int) (Math.random() * 6) + 1;
        int randDiceNum2 = (int) (Math.random() * 6) + 1;
        int sum = 0;
        int count = 0;
        while (userWantNum != sum) {
            randDiceNum1 = (int) (Math.random() * 6) + 1;
            randDiceNum2 = (int) (Math.random() * 6) + 1;
            sum = 0;
            sum = randDiceNum1 + randDiceNum2;
            count++;
        }

        return count;
    }
}
