package chap6;

public class Exercise0613 {
    public static String trueValueReturn(int number){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(number).append("의 개수만큼 소수 출력: ");
        for(int i = 2; i<Integer.MAX_VALUE; i++){
            if(Exercise0611.isTrue(i)){
                count++;
                sb.append(i).append(", ");

            }
            if(count == number){
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(trueValueReturn(15));
        System.out.println(trueValueReturn(3));
    }
}
