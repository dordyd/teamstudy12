import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        if((a==b)&&(b==c))
        System.out.print("정삼각형");
        else if((a!=b)&&(b!=c)&&(c!=a))
        System.out.print("그냥 삼각형");
        else
        System.out.print("이등변 삼각형");

    }
}
