package chap10.exercise1005;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1005 {

    public static int readOneCount(BufferedReader br, int count) throws IOException{
        String str = br.readLine();
        
        if(str == null){
            return count;
        }
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return readOneCount(br, count);
    }
    public static int solution(BufferedReader br) throws IOException{
        return readOneCount(br, 0);
    }
    
    public static void main(String[] args) throws IOException {
        File f = new File("SelectCourse1/YH/chap10/exercise1005/ex1005data.txt");
        // FileWriter fw = new FileWriter(f);
        
        BufferedReader br = new BufferedReader(new FileReader(f));

        System.out.println(solution(br));
    }
}
