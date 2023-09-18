package SelectCourse1.CH.chap4;

public class prac04_02 {
    public static boolean sumOverflow(byte x, byte y){
        short sx = x;
        short sy = y;
        return 128 <= sx+sy || sx+sy <= -129; 
    }

    public static void main(String[] args) {
        Byte x = -125;
        Byte y = -64;
        System.out.println(sumOverflow(x,y));

        x = 126;
        y = 12;
        System.out.println(sumOverflow(x,y));
    }
}
