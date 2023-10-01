package chap10;

public class Exercise1001{
    public static int fibo(int n){
        int [] arr = {0, 1};
        for(int i = 2; i<=n; i++){
            if(i%2 == 0){
                arr[0] = arr[0]+ arr[1];
            }
            else{
                arr[1] = arr[0] + arr[1];
            }
        }
        
        return arr[0] + arr[1];
    }
   
    public static void main(String[] args) {
        System.out.println(fibo(5));
        System.out.println(Exercise1002.fibo(5));
    }
}