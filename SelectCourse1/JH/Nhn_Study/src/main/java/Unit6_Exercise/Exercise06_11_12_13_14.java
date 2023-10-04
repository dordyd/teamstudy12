package Unit6_Exercise;

import java.util.Scanner;

public class Exercise06_11_12_13_14 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrime(int num) {
        if (isPrime(num)) {
            System.out.println(num + "은(는) 소수입니다.");
        } else {
            System.out.println(num + "은(는) 소수가 아닙니다.");
        }
    }

    public static void printAllPrime(int num) {
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.printf(i + " ");
            }
        }
    }

    public static void printNumberOfPrime(int num) {
        int count = 0;
        int number = 2;
        while (count < num) {
            if (isPrime(number)) {
                System.out.printf(number + " ");
                count++;
            }
            number++;
        }
    }

    public static void primeFactors(int num) {
        int factor = 2;
        while (num > 1) {
            if (num % factor == 0) {
                System.out.print(factor + " ");
                num /= factor;
            } else {
                factor++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        printPrime(inputNum);
        System.out.println("====================================");
        printAllPrime(inputNum);
        System.out.println();
        System.out.println("====================================");
        printNumberOfPrime(inputNum);
        System.out.println();
        System.out.println("====================================");
        primeFactors(inputNum);
    }
}
