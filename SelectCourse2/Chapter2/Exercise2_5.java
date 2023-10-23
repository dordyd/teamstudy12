package Chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2_5 {
    private int numberOfEggs;
    private int dozens;
    private int gross;
    private Option selectedOption;

    private static final int EGGS_PER_DOZEN_IN_A_DOZEN = 12;
    private static final int EGGS_PER_DOZEN_IN_A_GROSS = 144;

    private enum Option {
        GROSS, DOZEN
    }

    public Exercise2_5() {
    }

    public Exercise2_5(Option selectedOption) {
        this.selectedOption = selectedOption;
        this.numberOfEggs = 0;
        this.dozens = 0;
        this.gross = 0;
    }

    private void calculate() {
        if (selectedOption == Option.GROSS) {
            gross = numberOfEggs / EGGS_PER_DOZEN_IN_A_GROSS;
            numberOfEggs %= EGGS_PER_DOZEN_IN_A_GROSS;
            dozens = numberOfEggs / EGGS_PER_DOZEN_IN_A_DOZEN;
            numberOfEggs %= EGGS_PER_DOZEN_IN_A_DOZEN;
        } else if (selectedOption == Option.DOZEN) {
            dozens = numberOfEggs / EGGS_PER_DOZEN_IN_A_DOZEN;
            numberOfEggs %= EGGS_PER_DOZEN_IN_A_DOZEN;
        }
    }

    public void print() {
        if (selectedOption == Option.GROSS) {
            System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen, and " + numberOfEggs);
        } else if (selectedOption == Option.DOZEN) {
            System.out.println("Your number of eggs is " + dozens + " dozen, and " + numberOfEggs);
        }
    }

    public void insertEgg() {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("How many Eggs do you have? >> ");
                int eggs;
                try {
                    eggs = sc.nextInt();
                    if (eggs < 0) {
                        System.out.println("입력된 수가 음수입니다. 양수를 입력해 주세요.");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("유효하지 않은 입력입니다. 정수를 입력해주세요.");
                    sc.next();
                    continue;
                }
                numberOfEggs = eggs;
                break;
            }
        } catch (Exception e) {
            System.out.println("입력 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static Exercise2_5 selectOption() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("< Press Option >");
                System.out.println("1. To Gross");
                System.out.println("2. To Dozen");
                System.out.print("Your option >> ");
                int selectedOption = sc.nextInt();

                if (selectedOption == 1) {
                    return new Exercise2_5(Option.GROSS);
                } else if (selectedOption == 2) {
                    return new Exercise2_5(Option.DOZEN);
                } else {
                    System.out.println("잘못된 입력입니다. 1 또는 2를 입력해 주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 입력입니다. 1 또는 2를 입력해 주세요.");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Exercise2_5 user1 = selectOption();
        user1.insertEgg();
        user1.calculate();
        user1.print();
    }
}
