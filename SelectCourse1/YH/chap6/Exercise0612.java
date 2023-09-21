package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise0612 {
    public static String trueValueReturn(int number){
        StringBuilder sb = new StringBuilder();
        sb.append(number).append("이하의 소수 출력: ");
        for(int i = 2; i<=number; i++){
            if(Exercise0611.isTrue(i)){
                sb.append(i).append(", ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(trueValueReturn(n));
    }
}
