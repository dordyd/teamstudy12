/*This exercise asks you to write a few lambda expressions and a function that returns a lambda expression as its value. 
Suppose that a function interface ArrayProcessor is defined as

public interface ArrayProcessor {
    double apply( double[] array );
}

Write a class that defines four public static final variables of type ArrayProcessor that process an array in the following ways:
 find the maximum value in the array, find the minimum value in an array, find the sum of the values in the array, 
 and find the average of the values in the array. In each case, the value of the variable should be given by a lambda expression. 
 The class should also define a function

public static ArrayProcessor counter( double value ) { ...
This function should return an ArrayProcessor that counts the number of times that value occurs in an array. 
The return value should be given as a lambda expression.

The class should have a main() routine that tests your work. 
The program that you write for this exercise will need access to the file ArrayProcessor.java, which defines the functional interface.
*/

package SelectCourse2.Chap04;

import org.junit.jupiter.api.Assertions;

public class Prac4_5 {

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
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    };

    public static ArrayProcessor min = array -> {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
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