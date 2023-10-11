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
        BigNumber copyNum = new BigNumber();
        BigNumber returnNum = copyNum;
        BigNumber temp = num;
        for (int i = 0; i < BigNumber.count(num); i++) {
            temp = num;
            for (int j = 0; j < BigNumber.count(num) - 1 - i; j++) {
                temp = temp.next;
            }
            copyNum.next = new BigNumber(temp.digit);
            copyNum = copyNum.next;
        }
        return returnNum.next;
    }

    public static BigNumber add(BigNumber num1, BigNumber num2) {
        BigNumber sumNum = new BigNumber();
        BigNumber returnNum = sumNum;
        num1 = BigNumber.reverse(num1);
        num2 = BigNumber.reverse(num2);
        BigNumber temp1 = new BigNumber();
        BigNumber temp2 = new BigNumber();
        temp1.next = num1;
        temp2.next = num2;

        int carry = 0;

        BigNumber zero = new BigNumber(0);
        while (temp1.next != null || temp2.next != null) {

            if (temp1.next != null) {
                temp1 = temp1.next;
            } else {
                temp1 = zero;
            }
            if (temp2.next != null) {
                temp2 = temp2.next;
            } else {
                temp2 = zero;
            }


            sumNum.next = new BigNumber(temp1.digit + temp2.digit + carry);
            if (temp1.digit + temp2.digit + carry >= 10) {
                carry = 1;
                sumNum.next.digit -= 10;
            } else {
                carry = 0;
            }
            sumNum = sumNum.next;
        }
        return BigNumber.reverse(returnNum.next);
    }

    public static BigNumber minus(BigNumber num1, BigNumber num2) {
//        241665
//         22049
        BigNumber temp1 = BigNumber.reverse(num1);
        BigNumber temp2 = BigNumber.reverse(num2);
        BigNumber zero = new BigNumber(0);
        BigNumber minusNumber = new BigNumber();
        BigNumber returnNum = minusNumber;

        int carry = 0;
        while (temp1!= zero && temp2!= zero) {
            minusNumber.digit = temp1.digit - temp2.digit - carry;
            carry = 0;
            if (minusNumber.digit < 0) {
                carry = 1;
                minusNumber.digit += 10;
            }
            if (temp1.next != null) {
                temp1 = temp1.next;
            } else {
                temp1 = zero;
            }
            if (temp2.next != null) {
                temp2 = temp2.next;
            } else {
                temp2 = zero;
            }
            minusNumber.next = new BigNumber();
            minusNumber = minusNumber.next;
        }

        return BigNumber.reverse(returnNum);
    }

    public static BigNumber compare(BigNumber num1, BigNumber num2) {
        if (BigNumber.count(num1) > BigNumber.count(num2)) {
            return num1;
        } else if (BigNumber.count(num1) < BigNumber.count(num2)) {
            return num2;
        } else {
            while (num1 != null && num2 != null) {
                if (num1.digit > num2.digit) {
                    return num1;
                } else if (num1.digit < num2.digit) {
                    return num2;
                }
                num1 = num1.next;
                num2 = num2.next;
            }
        }
        return null;
    }


    public static boolean equals(BigNumber num1, BigNumber num2) {
        if (BigNumber.count(num1) != BigNumber.count(num2)) {
            return false;
        }
        while (num1 != null && num2 != null) {
            if (num1.digit != num2.digit) {
                return false;
            }
            num1 = num1.next;
            num2 = num2.next;
        }
        return true;
    }


    public static void main(String[] args) {
        BigNumber num = new BigNumber("22049");
        BigNumber num2 = new BigNumber("241665");
        BigNumber num4 = num2;

        BigNumber.print(num);
        System.out.println();

        BigNumber.print(BigNumber.reverse(num));
        System.out.println();

        BigNumber.print(BigNumber.reverse(num2));
        System.out.println();

        BigNumber num3 = BigNumber.add(num, num2);
        System.out.println();
        BigNumber.print(num3);

        BigNumber large = BigNumber.compare(num, num2);
        System.out.println();
        BigNumber.print(large);

        System.out.println();
        BigNumber.print(num2);
        System.out.println();
        System.out.println(BigNumber.equals(num2, num4));
        BigNumber.print(num2);
        System.out.println();
        BigNumber.print(num);
        System.out.println();
        BigNumber minus = BigNumber.minus(num2, num);
        BigNumber.print(minus);
    }
}
