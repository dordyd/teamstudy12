package Unit10_Exercise;

public class Exercise10_1_2 {

    public static int Fibonacci(int num, int callNum) {
        callNum++;
        if (num == 0) {
            return 0;
        } else if (num <= 2) {
            return 1;
        } else {
            System.out.println("Fibonacci(" + num + "), callNum = " + callNum);
            return Fibonacci(num - 1, callNum) + Fibonacci(num - 2, callNum);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(10, 0));
    }
}
