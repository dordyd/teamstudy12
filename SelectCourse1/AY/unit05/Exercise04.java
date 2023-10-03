public class Exercise04 {
    private double l;
    private double m;
    private double s;

    public void setlen(int l,int m,int s){
       // if()
    }

    public int  getRound(int l,int m,int s){
        return l+m+s;
    }

    // public int getlrel(Exercise04 ex){
    //     int s=(ex.l+ex.m+ex.s)/2;
    //     return (int)Math.sqrt(s*(s-l)*(s-m)*(s-s));
    // }

    public void typeOf(Exercise04 ex){
        if((ex.l==ex.m)&&(ex.m==ex.s)&&(ex.s==ex.l))
        System.out.print("정삼각형");
        else if((ex.l!=ex.m)&&(ex.m!=ex.s)&&(ex.s!=ex.l))
        System.out.print("그냥 삼각형");
        else
        System.out.print("이등변 삼각형");
    }

  
        public Exercise04(double l, double m, double s) {
            this.l = l;
            this.m = m;
            this.s = s;
        }
    
        public double getLongSide() {
            return Math.max(Math.max(l, m), s);
        }
    
        public double getmSide() {
            if (l < m && m < s || s < m && m < l) {
                return m;
            } else if (m < l && l < s || s < l && l < m) {
                return l;
            } else {
                return s;
            }
        }
    
        public double getShortSide() {
            return Math.min(Math.min(l, m), s);
        }
    
        public boolean isTriangleValid() {
            double longest = getLongSide();
            double intermedium = getmSide();
            double shortest = getShortSide();
    
            return longest < (intermedium + shortest);
        }
    
        public double getPerimeter() {
            return l + m + s;
        }
    
        public double getArea() {
            double s = getPerimeter() / 2;
            return Math.sqrt(s * (s - l) * (s - m) * (s - s));
        }
    
        // public String getType() {
        //     if (l == m && m == s) {
        //         return "Regular Exercise04";
        //     } else if (l == m || l == s || m == s) {
        //         return "Symmetric Exercise04";
        //     } else {
        //         return "Irregular Exercise04";
        //     }
        // }
    
        public static void main(String[] args) {
            Exercise04 triangle1 = new Exercise04(3, 4, 5);

    
            System.out.println("Exercise04 1:");
            System.out.println("Longest Side: " + triangle1.getLongSide());
            System.out.println("Intermediate Side: " + triangle1.getmSide());
            System.out.println("Shortest Side: " + triangle1.getShortSide());
            System.out.println("Valid Exercise04: " + triangle1.isTriangleValid());
            System.out.println("Perimeter: " + triangle1.getPerimeter());
            System.out.println("Area: " + triangle1.getArea());
           // System.out.println("Type: " + triangle1.getType());
    
           
        }
    }
    


//re