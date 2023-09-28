package chap9.exercise0903;

public class Exercise0903 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }

    // 오류 발생하지 않음.
    // ----------출력문--------------
    // I am an object of the Base class
    // I am an object of the Derived class, I am an object of the Base class
    // I am an object of the Derived class, I am an object of the Base class
}
