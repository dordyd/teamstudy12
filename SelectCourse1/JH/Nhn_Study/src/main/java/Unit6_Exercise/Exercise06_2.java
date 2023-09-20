package Unit6_Exercise;

public class Exercise06_2 {

    public static void solution(int range) {
        for (int i = 2; i <= range; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        solution(10);
    }
}
