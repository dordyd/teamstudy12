import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class IOStrings{

    public String[] loadArray(InputStream is, int n) throws IOException{
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String arr[]=new String[n];
        for(int i=0; i<n; i++){
        arr[i]=br.readLine();
        }
        return arr;
}

public void saveArray(OutputStream os, String[] sa) throws IOException{
    OutputStreamWriter osw=new OutputStreamWriter(os);
    BufferedWriter bw=new BufferedWriter(osw);//printWiter?
    
        for (String str : sa) {
                bw.write(str);
                bw.newLine();
        }
    
}
public static void main(String[] args) {
    
}
}

