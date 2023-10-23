package Chapter4;

public class Exercise4_5 {
    public interface ArrayProcessor {
        double apply(double[] array);
    }

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
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    };

    public static ArrayProcessor min = array -> {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    };

    public static ArrayProcessor sum = array -> {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    };

    public static ArrayProcessor average = array -> {
        double avg = sum.apply(array) / array.length;
        return avg;
    };

    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        System.out.println(sum.apply(list));
        System.out.println(max.apply(list));
        System.out.println(min.apply(list));
        System.out.println(average.apply(list));
        System.out.println(counter(10).apply(list));
    }
}


