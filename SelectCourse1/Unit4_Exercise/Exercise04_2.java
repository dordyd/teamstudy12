package Unit4_Exercise;

public class Exercise04_2 {

    public static boolean sumOverflow(byte x, byte y) {
        short sum = (short) (x + y);
        return sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE;
    }

    public static void main(String[] args) {


        // overflow => true
        // short (-128 ~ 127)
        byte x1 = 10;
        byte y1 = 20;
        System.out.println("sumOverflow(" + x1 + ", " + y1 + "): " + sumOverflow(x1, y1));

        byte x2 = 100;
        byte y2 = 20;
        System.out.println("sumOverflow(" + x2 + ", " + y2 + "): " + sumOverflow(x2, y2));

        byte x3 = -120;
        byte y3 = -10;
        System.out.println("sumOverflow(" + x3 + ", " + y3 + "): " + sumOverflow(x3, y3));

    }
}
