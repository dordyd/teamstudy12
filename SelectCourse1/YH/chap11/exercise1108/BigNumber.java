package chap11.exercise1108;

import java.math.BigInteger;

public class BigNumber {
    int digit;
    BigNumber next;


    public BigNumber() {
    }

    public BigNumber(int number) {
        this.digit = number;
    }

    public BigNumber(String num) {
        if (!num.isEmpty()) {
            this.digit = num.charAt(0) - '0';
            if (num.length() == 1) {
                next = null;
            } else {
                next = new BigNumber(num.substring(1));
            }
        }
    }

    public static BigNumber genNode(BigNumber num) {
        BigNumber gen = new BigNumber();
        gen.next = num;
        num = gen;

        return num;
    }

    public static void print(BigNumber num) {
        while (num != null) {
            System.out.print(num.digit);
            num = num.next;
        }
    }

    public static int count(BigNumber num) {
        int count = 0;
        while (num != null) {
            count++;
            num = num.next;
        }

        return count;
    }

    public static BigNumber reverse(BigNumber num) {
        BigNumber init = num;
        BigNumber reverse = new BigNumber();
        BigNumber newNum = new BigNumber();
        int count = BigNumber.count(num);
        for (int i = 0; i < count; i++) {
            num = init;
            for (int j = 0; j < count-i-1; j++) {
                num = num.next;
            }
            newNum = new BigNumber(num.digit);

        }
        return reverse;
    }

//    public static BigNumber add(BigNumber num1, BigNumber num2) {
//        int length1 = BigNumber.count(num1);
//        int length2 = BigNumber.count(num2);
//
//        if (length1 < length2) {
//            BigNumber temp = num1;
//            num1 = num2;
//            num2 = temp;
//
//            int tempint = length1;
//            length1 = length2;
//            length2 = tempint;
//        }
//
//        BigNumber gen1 = genNode(num1);
//        BigNumber gen2 = genNode(num2);
//
//        BigNumber result = new BigNumber();
//        for (int i = 0; i < length1 - length2; i++) {
//            gen1 = gen1.next;
//            result.next = new BigNumber(gen1.digit);
//        }
//        while (gen1.next != null) {
//            if (gen1.next.digit + gen2.next.digit > 10) {
//                result.digit + 1;
//            }
//        }
//
//    }


    public static void main(String[] args) {
        BigNumber num = new BigNumber("12049");


        BigNumber.print(num);
        System.out.println();
        BigNumber.print(BigNumber.reverse(num));
    }
}
