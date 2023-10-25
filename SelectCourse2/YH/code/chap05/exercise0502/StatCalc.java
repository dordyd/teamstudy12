package SelectCourse2.YH.code.chap05.exercise0502;

import java.util.ArrayList;

public class StatCalc {
    private int[] dataSet;
    private int count;

    public StatCalc(int size){
        dataSet = new int[size];
        count = 0;
    }

    public void enter(int item){
        dataSet[count++] = item;
    }

    public int getCount(){
        return count;
    }

    public int getSum(){
        int sum = 0;
        for(int i = 0; i<count; i++)
            sum = sum + dataSet[i];

        return sum;
    }

    public int maxValue(){
        int retValue = dataSet[0];
        for(int i = 0; i<dataSet.length; i++){
            if(dataSet[i] > retValue)
                retValue = dataSet[i];
        }
        return retValue;
    }

    public double getMean(){
        return (double) getSum() / getCount();
    }

    public double getStandardDeviation(){
        double retValue = 0;
        double mean = getMean();
        for(int i = 0; i<count; i++){
            retValue += (dataSet[i] - mean) * (dataSet[i] - mean);
        }

        retValue = retValue / (count-1);

        return Math.sqrt(retValue);
    }

    public static void main(String[] args) {
        StatCalc statCalc = new StatCalc(6);

        statCalc.enter(10);
        statCalc.enter(8);
        statCalc.enter(10);
        statCalc.enter(8);
        statCalc.enter(8);
        statCalc.enter(4);

        System.out.println(statCalc.getCount());
        System.out.println(statCalc.getSum());
        System.out.println(statCalc.getMean());
        System.out.println(statCalc.getStandardDeviation());
    }

}
