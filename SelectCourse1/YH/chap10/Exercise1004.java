package chap10;

public class Exercise1004 {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static boolean prime(int a, int b){
        if(a == 1 || b == 1){
            return true;
        }
        else{
            if(a == b){
                return false;
            }
            else if (a < b){
                return prime(a, b - a);
            }
            else{
                return prime(a-b, b);
            }
        }
    }
    public static int rest(int x, int y){
        if(0 <= x && x<y){
            return x;
        }
        else if(x < 0){
            return rest(x+y, y);
        }
        else   
            return rest(x-y, y);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10, 5));
        System.out.println(prime(15, 3));
        System.out.println(rest(15, 5));
    }
}
