
public class Ex02 {
    public static int fibonacci(int n,int i){
        i++;
        if(n==1||n==2)
        return 1;
        else
        return fibonacci(n-1,i)+fibonacci(n-2,i);
    }
    public static void main(String[] args) {
        int count=0;
        System.out.println(" result="+fibonacci(5,count));
        System.out.println("count= "+count);
    }
}