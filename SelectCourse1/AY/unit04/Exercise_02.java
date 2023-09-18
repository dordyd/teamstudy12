public class Exercise_02 {
    public static boolean sumOverflow(byte x, byte y) {
    
        short a = x;
        short b = y;
        
      
            short sum = (short) (a + b);

            return (sum < -127 || sum > 128);
    }

    public static void main(String[] args) {

        byte x = 100;
        byte y = 38;


    boolean isOverflow = sumOverflow(x, y);

        if (isOverflow) {
            System.out.println("The sum causes overflow.");
        } else {
            System.out.println("The sum does not cause overflow.");
        }
    }
}

