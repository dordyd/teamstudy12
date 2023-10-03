import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;

public class IOFile {
    String filename;
    
    public IOFile(String filename){
        this.filename=filename;
    }

    public int countLines() throws IOException{
        // String filename="ex06.txt";
        // File f=new File(filename);
        FileReader fr = new FileReader(filename);
        BufferedReader in = new BufferedReader(fr);

        int n=0;
        String line=in.readLine();
        while(line!=null){         
            n++;
        }
        return n;
    }

    public void write(OutputStream os) throws FileNotFoundException{
    //     PrintStream ps = new PrintStream(os);
    //    String line=ps.
    //     while (filename != null) {
    //         ps.println(filename);
    //     }
    FileInputStream is=new FileInputStream(filename);
    BufferedInputStream bis=new BufferedInputStream(is);

    }
    
    public void print() throws IOException{
        FileReader fr=new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null){
            System.out.println(line);
        }
    }

    public void copy(String filename) throws IOException{
        FileReader f=new FileReader(filename);
        FileWriter fw=new FileWriter(filename);
        BufferedReader br=new BufferedReader(f);
        PrintWriter pw=new PrintWriter(fw);

        String line=br.readLine();

        while(line!=null){
            pw.println(line);
        }
    }

    public void delete(){
    File f= new File(filename);
    f.delete();
    }
}
