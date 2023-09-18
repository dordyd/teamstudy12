package SelectCourse1.CH.chap5;

public class prac05_04 {
    public static class Triangle {
        private double a;
        private double b;
        private double c;

        private Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public static Triangle createTriangle(double a, double b, double c) {
            if (canCreateTriangle(a, b, c)) {
                return new Triangle(a, b, c);
            }
            throw new IllegalArgumentException("class invariant");
        }

        public static boolean canCreateTriangle(double a, double b, double c) {
            double longest = Math.max(Math.max(a, b), c);
            return longest < a + b + c - longest;
        }

        public double getPerimeter() {
            return a + b + c;
        }

        public double getSize() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public String getType() {
            if (Double.compare(a, b) == 0 && Double.compare(b, c) == 0) {
                return "regular";
            } else if (Double.compare(a, b) == 0 || Double.compare(b, c) == 0 || Double.compare(a, c) == 0) {
                return "symmetric";
            } else {
                return "irregular";
            }
        }
    }

    public static void main(String[] args) {
        Triangle regular = Triangle.createTriangle(3, 3, 3);
        System.out.println("삼각형 넓이: " + regular.getSize());
        System.out.println("타입 : " + regular.getType());
        System.out.println("둘레 : " + regular.getPerimeter());

        Triangle symmetric = Triangle.createTriangle(3, 3, 2);
        System.out.println("삼각형 넓이: " + symmetric.getSize());
        System.out.println("타입 : " + symmetric.getType());
        System.out.println("둘레 : " + symmetric.getPerimeter());

        Triangle irregular = Triangle.createTriangle(4, 5, 2);
        System.out.println("삼각형 넓이: " + irregular.getSize());
        System.out.println("타입 : " + irregular.getType());
        System.out.println("둘레 : " + irregular.getPerimeter());

        Triangle classInvariant = Triangle.createTriangle(1, 2, 4);
    }
}
