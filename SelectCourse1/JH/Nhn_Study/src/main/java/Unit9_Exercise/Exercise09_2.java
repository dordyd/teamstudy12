package Unit9_Exercise;

public class Exercise09_2 {
    private int x = 101;

    private void f(int x) {
        this.x = x;
        this.x++;
//        x++;
        // does not generate errors
        // print 101
        g();
    }


    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise09_2 e = new Exercise09_2();
        int x = 200;
        e.f(x);
    }
}
