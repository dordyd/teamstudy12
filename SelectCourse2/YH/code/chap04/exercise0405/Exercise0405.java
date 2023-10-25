package SelectCourse2.YH.code.chap04.exercise0405;

public class Exercise0405 {

    public static ArrayProcessor counter(double value){
        return array -> {
            int count = 0;
            for(int i = 0; i<array.length; i++){
                if(value == array[i])
                    count++;
            }
            return count;
        };
    }

    public static ArrayProcessor maxValue(){
        return array -> {
            double maxVal = Double.MIN_VALUE;
            for(int i = 0; i<array.length; i++){
                if(maxVal < array[i]){
                    maxVal = array[i];
                }
            }
            return maxVal;
        };
    }

    public static ArrayProcessor minValue(){
        return array -> {
            double minVal = Double.MAX_VALUE;
            for(int i = 0; i<array.length; i++){
                if(minVal > array[i]){
                    minVal = array[i];
                }
            }
            return minVal;
        };
    }

//    public static ArrayProcessor findValue(){
//        return array -> {
//            double minVal = Double.MAX_VALUE;
//            for(int i = 0; i<array.length; i++){
//                if(minVal > array[i]){
//                    minVal = array[i];
//                }
//            }
//            return minVal;
//        };
//    }

    public static ArrayProcessor add(){
        return x -> {
            double sum = 0;
            for(int i = 0; i<x.length; i++){
                sum = sum+ x[i];
            }
            return sum;
        };
    }

    public static ArrayProcessor average(){
        return array -> add().apply(array) / array.length;
    }
}
