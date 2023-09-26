import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandleBAs {
    private String filename;
    
    public HandleBAs(String filename){
        this.filename=filename;
    }
    public void interests(double rate) throws IOException{

        File f=new File(filename);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        String line=br.readLine();
        double remainAccount =Double.parseDouble(line); //string->double
        remainAccount+=remainAccount*rate;

        bw.write(String.valueOf(remainAccount));//write에는 string만 입력가능

        
    }
    // public void printNegative() throws IOException{
    //     BufferedReader br = new BufferedReader(new FileReader(filename));
        
    //     String line=br.readLine();

    //     while(line!=null){
              
    //         }
    //     }

    }

