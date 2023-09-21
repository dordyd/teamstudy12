package chap4;


public class Exercise0408 {
    public static void method(int a, Account b) {
        a *= 2;
        b.bal *= 2;
    }

    public static void main(String[] args) {
        int c = 100;
        Account r = new Account(100);
        method(c, r);
        System.out.println(c + " " + r.bal); // side effect
        // c의 값은, static memory에 존재하기에, side effect가 안일어남.
        // r은 Heap memory에 있기에, 주소값을 반환하기에, 바뀌어있음.
    }
}
