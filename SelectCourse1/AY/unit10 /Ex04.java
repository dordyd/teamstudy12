public class Ex04 {
    public static int rest(int x,int y){
        if(0 <= x && x<y){
            return x;
        }
        else if(x < 0){
            return rest(x+y, y);
        }
        else   
            return rest(x-y, y);
    }
    public static boolean isPrime(int x, int y) {
        if (x == 1 || y == 1) 
        return true;
        else if (x == y) 
        return false;
        else if (x < y) 
        return isPrime(x, y - x);
        else 
        return isPrime(x - y, y);
        
    }
    
    public static int gcd(int x,int y){
        if(y==0)
        return x;
        else 
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        System.out.println(gcd(11,1));
    }
}
//re
