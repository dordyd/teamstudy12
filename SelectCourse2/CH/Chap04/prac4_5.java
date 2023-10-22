package SelectCourse2.CH.Chap04;

import org.junit.jupiter.api.Assertions;

public class prac4_5 {

    public static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }
            return count;
        };
    }

    public static ArrayProcessor max = array -> {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    };

    public static ArrayProcessor min = array -> {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    };

    public static ArrayProcessor sum = array -> {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    };

    public static ArrayProcessor avg = array -> sum.apply(array) / array.length;

    public static void main(String[] args) {
        double[] arr = { 3.0, 2.0, 1.0, 6.0, 5.0, 4.0 };
        double[] arr2 = { 2.1111111111, 2.222222222, 2.333333333, 4.444444444, 5.555555555, 6.6666666666 };

        Assertions.assertTrue(Double.compare(21.0, sum.apply(arr)) == 0);
        Assertions.assertTrue(Double.compare(23.333333331700004, sum.apply(arr2)) == 0);

        Assertions.assertTrue(Double.compare(min.apply(arr2), 2.1111111111) == 0);
        Assertions.assertTrue(Double.compare(min.apply(arr), 1) == 0);

        Assertions.assertTrue(Double.compare(max.apply(arr2), 6.6666666666) == 0);
        Assertions.assertTrue(Double.compare(max.apply(arr), 6.0) == 0);

        Assertions.assertTrue(Double.compare(avg.apply(arr2), 3.8888888886166675) == 0);
        Assertions.assertTrue(Double.compare(avg.apply(arr), 3.5) == 0);

        Assertions.assertTrue(counter(2.0).apply(arr2) == 0);
        Assertions.assertTrue(counter(2.0).apply(arr) == 1);

    }
}
