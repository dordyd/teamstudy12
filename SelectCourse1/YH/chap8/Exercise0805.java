package chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exercise0805 {
    public static String mostGoodStudent(String filepath) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        String str = br.readLine();
        String maxStr = str;
        String [] arr = str.split(" ");
        double total = 0;
        double average = 0;
        double maxAverage = 0;
        while(str != null){
            for(int i = 1; i<arr.length; i++){
                total = total + Integer.parseInt(arr[i]);
            }
            average = total / arr.length-1;
            if(average > maxAverage){
                maxStr = str;
                maxAverage = average;
            }
            str = br.readLine();
        }

        return maxStr;
    }
    public static void main(String[] args) throws IOException {
        String filepath = "SelectCourse1/YH/chap8/ex0805data.txt";
        // FileWriter fileWriter = new FileWriter(filepath);
        // PrintWriter pw = new PrintWriter(fileWriter);
        
        System.out.println(mostGoodStudent(filepath));
        
    }
}
