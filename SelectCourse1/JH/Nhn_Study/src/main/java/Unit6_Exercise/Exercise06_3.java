package Unit6_Exercise;

public class Exercise06_3 {

    public static int factorial(int inputNum) {
        int result = 1;
        if (inputNum < 0) {
            System.out.println("입력한 값이 0보다 작습니다.");
        } else {

            for (int i = 1; i <= inputNum; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

}
