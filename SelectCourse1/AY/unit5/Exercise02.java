public class Exercise02 {
    
    public static String Type(double side1, double side2, double side3) {
        int equalPairs = 0;

        if (side1 == side2) {
            equalPairs++;
        }
        if (side1 == side3) {
            equalPairs++;
        }
        if (side2 == side3) {
            equalPairs++;
        }

        if (equalPairs == 0) {
            return "Irregular Triangle";
        } else if (equalPairs == 1) {
            return "Symmetric Triangle";
        } else {
            return "Regular Triangle";
        }}

    public static void main(String[] args) {
        
        
    }
}
