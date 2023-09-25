package chap8.exercise0807;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HandleBAs {
    String filename;

    public HandleBAs(String filename) throws FileNotFoundException{
        this.filename = filename;    
    }

    public void interests(double rate) throws IOException{
        FileWriter fw = new FileWriter("SelectCourse1/YH/chap8/exercise0807/ex0807copydata.txt",false);
        PrintWriter pw = new PrintWriter(fw);
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        
        String str = br.readLine();
        while(str != null){
            String [] strArr = str.split(" ");
            strArr[2] = String.valueOf(Double.valueOf(strArr[2]) + Double.valueOf(strArr[2]) * (rate / 100.0));

            pw.println(strArr[0] + " " + strArr[1] + " " + strArr[2]);
            str = br.readLine();
        }
        pw.close();
        fw.close();
        File oldfile = new File(filename);
        File newfile = new File("SelectCourse1/YH/chap8/exercise0807/ex0807copydata.txt");

        boolean b = newfile.renameTo(oldfile);
    }

    public void printNegative() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String str = br.readLine();
        while(str != null){
            String [] strArr = str.split(" ");
            if(Double.parseDouble(strArr[2]) < 0){
                System.out.println(str);
            }
            str = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        HandleBAs handleBAs = new HandleBAs("SelectCourse1/YH/chap8/exercise0807/ex0807data.txt");
        handleBAs.interests(10);
        handleBAs.printNegative();
    }
}
