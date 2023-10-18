package chap9;

public class Exercise0901 {
    // public static void main(String[] args) {
    //     for (int i = 0, j = 0; i < 10, j < 10; i++, j++) {
    //         System.out.println(i + " + " + j + " = " + (i+j));  
    //         }
    //     System.out.println("I’ve printed out the sums of i and j up to " + i + "," + j);
    // }

    // 1. syntax error 
    // 컴파일시 나는 오류 -> for(initialization, condition, increament) 에서
    // condition syntax에 올바르지 않음. i<10, j<10. -> i<10 || j<10 으로 바꿔야함.
    // 2. 
    // i값과 j값은 for 안의 Activation record의 지역변수로 사용됨.
    // 마지막에 나오는 println은 콜스택에 쌓이는 새로운 Activation record이기에 메인에서의 i, j는 무슨 의미인지 확인을 못함.
    // int  

    // 완성 코드
    public static void main(String[] args) {
//        int sumI = 0;
//        int sumJ = 9;
//        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
//            System.out.println(i + " + " + j + " = " + (i + j));
//        }
//        System.out.println("I’ve printed out the sums of i and j up to " + sumI + "," + sumJ);

        String str = "0111";
        int a = Integer.parseInt(str);
        System.out.println(a);
    }

}
