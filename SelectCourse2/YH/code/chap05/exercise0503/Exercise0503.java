package SelectCourse2.YH.code.chap05.exercise0503;

import SelectCourse2.YH.code.chap04.Exercise0403;
import SelectCourse2.YH.code.chap04.Exercise0404;
import SelectCourse2.YH.code.chap05.exercise0502.StatCalc;

public class Exercise0503 {

    public static void main(String[] args) {
        System.out.println("\tindex \t\t 평균 \t\t 표준편차 \t 최대 횟수");
        for(int i = 2; i<13; i++) {
            StatCalc dataSet = new StatCalc(10000);
            for (int j = 0; j < 10000; j++) {
                dataSet.enter(Exercise0403.predictNumber(i));
            }
            System.out.printf("DiceResult %d =\t%2.3f\t||\t%.3f\t||\t  %3d\n", i, dataSet.getMean(), dataSet.getStandardDeviation(), dataSet.maxValue());

        }
    }
}
