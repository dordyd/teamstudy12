package chap6;

public class Exercise0614 {
    public static String 소인수분해(int number){
        StringBuilder sb = new StringBuilder();
        int i = 2;
        while(number > 1){
            if(Exercise0611.isTrue(i) && number%i == 0){
                sb.append(i).append(" ");
                number /=i;
            }
            else
                i++;
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(소인수분해(220));
        System.out.println(소인수분해(3));
    }
}
