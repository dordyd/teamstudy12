/*Write a function that simulates rolling a pair of dice until the total on the dice comes up to be a given number. 
The number that you are rolling for is a parameter to the function. The number of times you have to roll the dice is the return value of the function.
 The parameter should be one of the possible totals: 2, 3, ..., 12. The function should throw an IllegalArgumentException if this is not the case.
  Use your function in a program that computes and prints the number of rolls it takes to get snake eyes.
   (Snake eyes means that the total showing on the dice is 2.)
*/
package SelectCourse2.Chap04;

public class Prac4_3 {

    public static int rollingDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static int twoDiceSum() {
        return rollingDice() + rollingDice();
    }

    public static int predictNumber(int number) {
        if (number < 2 || number > 12) {
            throw new IllegalArgumentException("주사위 합은 2 < sum < 12");
        }

        int count = 1; // 기본적으로 1회 시행
        while (twoDiceSum() != number) {
            count++; // 같지 않으면 계속 시행
        }

        return count; // 횟수 출력
    }

    public static void main(String[] args) {
        System.out.println(predictNumber(10));
    }
}
