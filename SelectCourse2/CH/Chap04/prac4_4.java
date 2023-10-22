package SelectCourse2.CH.Chap04;

public class prac4_4 {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        System.out.printf("%10s%10s\n", "주사위의 총합", "평균 굴림 횟수");
        System.out.printf("%16s%16s\n", "--------------", "--------------");
        for (int i = 2; i < 13; i++) {
            System.out.printf("%10d%18.4f\n", i, twoDiceSumAvgSimulator(i));
        }

    }

    public static double twoDiceSumAvgSimulator(int userWantNum) {
        int sum = 0;
        for (int j = 0; j < 10000; j++) {
            sum += prac4_3.twoDiceSumSimulator(userWantNum);
        }
        return sum / 10000;
    }
}
