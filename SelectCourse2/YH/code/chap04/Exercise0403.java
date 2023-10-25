package SelectCourse2.YH.code.chap04;

/**
 * Exercise 4.3:
 * Write a function that simulates rolling a pair of dice until the total on the dice comes up to be a given number.
 * The number that you are rolling for is a parameter to the function.
 * The number of times you have to roll the dice is the return value of the function.
 * The parameter should be one of the possible totals: 2, 3, ..., 12.
 * The function should throw an IllegalArgumentException if this is not the case.
 * Use your function in a program that computes and prints the number of rolls it takes to get snake eyes.
 * (Snake eyes means that the total showing on the dice is 2.)
 */
public class Exercise0403 {
    public static int rollingDice() {
        return (int) (Math.random()*6) + (int) (Math.random() * 6) + 2; // 주사위 2번 던지는 행위의 값을 전부 더함.
        // 6+1
    }

    public static int predictNumber(int number) {
        correctInputNumberInDice(number);
        int answer = 1; // 기본적으로 1회 시행
        while(rollingDice() != number){
            answer ++; // 같지 않으면 계속 시행
        }

        return answer; // 횟수 출력
    }

    public static void correctInputNumberInDice(int number) {
        if (!(2 <= number && number <= 12)) {
            throw new IllegalArgumentException("주어진 숫자가 2~12 사이의 숫자가 아닙니다.");
        }
    }

    public static void main(String[] args) {
        System.out.println(predictNumber(10));
    }
}
