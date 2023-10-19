package SelectCourse2.YH.code.chap04.quizexercise;

public class Quiz0412 {
    public static int mostSmallValue(int a, int b, int c){
        return minvalue(a, minvalue(b, c));
    }

    public static int minvalue(int a, int b){
        if(a > b){
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(mostSmallValue(10, 12, 7));
    }
}
