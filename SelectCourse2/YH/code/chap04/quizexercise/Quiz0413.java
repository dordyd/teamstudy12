package SelectCourse2.YH.code.chap04.quizexercise;

public class Quiz0413 {
    public static double doubleAverage(double[] values) {
        double sum = 0.000;
        for (double value : values) {
            sum += value;
        }

        return sum/values.length;

    }

    public static void main(String[] args) {
        double [] arr = {10.62, 14.22, 11.6, 14.6671, 13.61};

        System.out.println(doubleAverage(arr));
    }
}
