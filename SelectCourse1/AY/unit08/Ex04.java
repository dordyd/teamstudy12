import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Ex04 {
    public static void multiTable(String fileName,int n) throws IOException{
      
        // File f=new File(fileName);
        // FileWriter fw=new FileWriter(f);
        // BufferedWriter pw=new BufferedWriter(fw);//bufferedWriter랑 printWriter 

        FileWriter fw = new FileWriter(fileName); 
        PrintWriter pw = new PrintWriter(fw); 

        //try catch를 써야하나
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                pw.print(i*j+" ");
                
                }pw.print("\n");
            }
            fw.close();
            

        }
    
public static void main(String[] args) throws IOException {
    int n=4;
    String fileName="ex04.txt";
    multiTable(fileName, n);
}
}

