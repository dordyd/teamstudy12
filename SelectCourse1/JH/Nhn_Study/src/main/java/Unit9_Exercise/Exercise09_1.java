package Unit9_Exercise;

public class Exercise09_1 {

//    public static void main(String[] args) {
//        for (int i = 0, j = 0; i < 10, j < 10; i++, j++) {
//            System.out.println(i + " + " + j + " = " + (i+j));
//        }
//        System.out.println("I've printed out the sums of i and j up to "
//                + i + "," + j);
//    }

    // generate compilation errors
    // for문의 조건문에서 ','를 사용할 수 없기 때문에
    // i, j는 10이다.
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
        System.out.println("I've printed out the sums of i and j up to "
                + i + "," + j);
    }


}
