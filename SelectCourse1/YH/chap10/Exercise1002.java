package chap10;

public class Exercise1002{

    public static long [] fiboArr = new long[100];
    
    // Provide an iterative implementation of a method that computes the n-th Fibonacci number.
    public static long fiboMemo(int n){
    
        if(n==0){
            return fiboArr[0] = 1l;
        }
        else if(n == 1){
            return fiboArr[1] = 1l;
        }
        else if(fiboArr[n] != 0){
            return fiboArr[n];
        }
        else{
            return fiboArr[n] = fiboMemo(n-2) + fiboMemo(n-1);
        }
            
    }  

    public static long fibo(long n){
        if(n == 0){
            return 1;
        }
        else if( n == 1){
            return 1;
        }
        else
            return fibo(n-2) + fibo(n-1);
    }
    public static void main(String[] args) {
    //     System.out.println(fibo(30));
    //     System.out.println(fiboMemo(30));
        System.out.println(fiboMemo(46));
        System.out.println(fibo(46));
    }
}