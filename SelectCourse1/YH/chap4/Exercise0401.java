package chap4;

import java.util.Scanner;

public class Exercise0401 {
    private final static double EuroValue = 0.035d;

    public static double convertLireEuro(double x) {
        return x * EuroValue;
    }


    public static boolean sumOverflow(byte x, byte y) {

        if (-128 <= x + y && x + y <= 127) //-128 can cahnge Byte.MIN_VALUE and also, 127 can change Byte.MAX_VALUE
        {
            return true;
        }

        return false;
    }

    public static int arthmeticMean(int a, int b) {
        return (a + b) / 2;
    }

    public static double geometricMean(int a, int b) {
        return Math.sqrt(a * b);
    }

    public static int greaterNum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int smallerNum(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(convertLireEuro(1000)); // ex 1

        exercise02();

        exercise0403(); // ex03


        System.out.println(even(1000)); // ex04

        short x = 22; // ex05
        byte y = (byte) x;
        System.out.println(y);

        exercise06();
        exercise07();
    }

    private static void exercise07() {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b1, b2;

        // s=65L -> short형에 long형을 저장함. (error)
        // f = i+100; int와 int를 더하면 int로 저장되고, float형에 저장하면 컴파일 에러 안남
        // i = 2*b + l; 2*b ->int형, l ->long형이므로 i에 저장 불가 (error)
        // b1 = s; b1 -> boolean, s = short (error)
        // b2 = s >= 57; b2-> boolean, s>=57 -> boolean이므로 문제 x
        // c = b -> b의 값을 초기화 하고, (char)를 붙여주면 가능하지만, char에 byte는 불가 (error)
        // c = 'b' -> char형에 'b' char형을 넣어서 가능
    }

    private static void exercise06() {
        exercise07();

    }

    private static void exercise02() {
        byte a, b;
        a = 120;
        b = 120;
        System.out.println(sumOverflow((byte) 12, (byte) 12));
        System.out.println(sumOverflow(a, b));   // ex 2
    }

    private static void exercise0403() {
        Scanner scanner = new Scanner(System.in); // ex 3
        System.out.print("input A num: ");
        int A = scanner.nextInt();
        System.out.print("input B num: ");
        int B = scanner.nextInt();
        System.out.println("arthmeticMean = " + arthmeticMean(A, B));
        System.out.println("geometricMean = " + geometricMean(A, B));
        System.out.println("greaterNum = " + greaterNum(A, B));
        System.out.println("smallerNum = " + smallerNum(A, B));
    }

}
