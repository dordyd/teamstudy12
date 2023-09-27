package SelectCourse1.CH.chap9;

public class prac09_02 {
    private int x = 101;

    private void f(int x) {
        x++;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        prac09_02 e = new prac09_02();
        int x = 200;
        e.f(x);
    }
}

/*
 * 오류 안 남
 * 그리고 print된 값은 101
 * x++; 해도 void f(int x) 에서 가져온 매개변수인 x가 증가하지 인스턴스 변수 x가 증가하지 않음.
 * 만약 그렇게 하고싶으면 this.x++;로해야함
 */