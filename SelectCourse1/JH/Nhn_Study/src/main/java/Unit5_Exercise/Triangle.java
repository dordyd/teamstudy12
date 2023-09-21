package Unit5_Exercise;

public class Triangle {

    private int side1; // longest
    private int side2; // middle
    private int side3; // shortest

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void checkTriangleType() {
        if (isTrianglePossible()) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("정삼각형입니다.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("이등변삼각형입니다.");
            } else {
                System.out.println("삼각형입니다.");
            }
        } else {
            System.out.println("삼각형이 될 수 없습니다.");
        }
    }

    private void checkSides() {
        int longest = Math.max(Math.max(side1, side2), side3);
        int shortest = Math.min(Math.min(side1, side2), side3);
        int mid = (side1 + side2 + side3) - (longest + shortest);

        side1 = longest;
        side2 = mid;
        side3 = shortest;
//        if (longest == mid) {
//            System.out.println("Longest : " + longest + "\n" + "Shortest : " + shortest);
//        } else {
        System.out.println("Longest : " + longest + "\n" + "Mid : " + mid + "\n" + "Shortest : " + shortest);
//        }
    }


    private boolean isTrianglePossible() {
        return side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1;
    }

    private double triangleArea() {
        double s = (double) (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4, 4, 7);
        triangle1.checkSides();
        triangle1.checkTriangleType();
        System.out.println(triangle1.triangleArea());
    }
}
