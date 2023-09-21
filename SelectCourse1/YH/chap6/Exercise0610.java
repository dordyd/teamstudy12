package chap6;

public class Exercise0610 {// ektlgkrl
    public static String factorial(int n){
        StringBuilder sb = new StringBuilder();
        if(n <= 0){
            System.out.println("number is negative");
            return "";
        }
        int result = 1;;
        for(int i = 1; i<=n; i++){
            result = result*i;
            if(i == n-1){
                sb.append(i).append(" = ");
            }
            else
                sb.append(i).append(" * ");
        }
        sb.append(result);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}