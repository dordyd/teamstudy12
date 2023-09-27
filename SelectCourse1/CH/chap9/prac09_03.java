package SelectCourse1.CH.chap9;

public class prac09_03 {
    public static class Base {
        public Base() {
            infob = "I am an object of the Base class";
        }

        public String getInfo() {
            return infob;
        }

        private String infob;
    }

    public static class Derived extends Base {
        public Derived() {
            super();
            infod = "I am an object of the Derived class";
        }

        public String getInfo() {
            return infod + ", " + super.getInfo();
        }

        private String infod;
    }

    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }
}

// base
// derived
// derived
/*
 * 순서로 print되는데 Base라고 선언한 b에 Derived d로 변수를 Assignment하면 동적바인딩이 일어나서 Derived의
 * method가 사용된다.
 */