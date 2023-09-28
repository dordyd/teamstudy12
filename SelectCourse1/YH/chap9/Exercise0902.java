package chap9;

public class Exercise0902 {
    // private int x = 101;

    private void f(int x) {
        x++;
        g(x);
    }

    // private void g() { // 이전 g()메서드
    //     System.out.println(x);
    // }
    private void g(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise0902 e = new Exercise0902();
        int x = 200;
        e.f(x);
    }
    // 1.Logical error
    // main 안의 x값의 +1의 값을 출력하려고 했지만, f함수에서 가리키는 x의 값은 main에서
    // 복사된 x 값을 가리키지만, g에서 가리키는 x는 class의 filed변수 x를 가리키고 있다.
    // 만약, 필드변수 x에 1이 더해진 결과를 출력하기 위해선 다음과 같이 변경하면 된다.


}
