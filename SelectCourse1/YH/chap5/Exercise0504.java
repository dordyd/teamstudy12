package chap5;

import javax.sound.midi.Receiver;

public class Exercise0504 {
    public static class Triangle{
        private int oneSide;
        private int twoSide;
        private int threeSide;
        private double s;

        public Triangle(int oneSide, int twoSide, int threeSide){
            this.oneSide = oneSide;
            this.twoSide = twoSide;
            this.threeSide = threeSide;
            s = (oneSide + twoSide + threeSide) / 2.0d;
        }

        public int getLongSide(){
            return max(oneSide, max(twoSide, threeSide));
        }

        public int getShortSide(){
            return min(oneSide, min(twoSide, threeSide));
        }

        public boolean isSquare(){
            if(oneSide == twoSide && twoSide == threeSide){
                return true;
            }
            return false;
        }

        public int getinterMediateSide(){
            if(!isSquare()){
                if(getLongSide() == oneSide){
                    return max(threeSide, twoSide);
                }
                else if(getLongSide() == twoSide){
                    return max(oneSide, threeSide);
                }
                else if(getLongSide() == threeSide){
                    return max(oneSide,  twoSide);
                }
            }
            return oneSide;
        }

        public boolean isTrue(){
            return getShortSide() + getinterMediateSide() > getLongSide();
        }

        public int getPerimeter(){
            return getLongSide() + getShortSide() + getinterMediateSide();
        }

        public double getArea(){
            return Math.sqrt(s*(s-oneSide)*(s - twoSide)*(s - threeSide));
        }

        public double getS(){
            return s;
        }

        public String representingTriangleType(){
            if(isSquare()){
                return "regular";
            }
            else if(oneSide!= twoSide && twoSide!=threeSide && threeSide != oneSide){
                return "irregular";
            }
            else{
                return "symmetric";
            }
        }
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getinterMediateSide());
        System.out.println(triangle.getLongSide());
        System.out.println(triangle.getShortSide());

        System.out.println(triangle.isTrue());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getS());
        System.out.println(triangle.representingTriangleType());
    }
    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        else return b;
    }
    public static int min(int a, int b){
        if(a > b){
            return b;
        }
        else return a;
    }
}
