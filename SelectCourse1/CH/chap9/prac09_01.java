package SelectCourse1.CH.chap9;

public class prac09_01 {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i + j));
            System.out.println("I've printed out the sums of i and j up to "
                    + i + "," + j);
        }

    }
}

// java for문 initialization, update는 여러개 쓸 수 있는데 continuation condition은 안된다
