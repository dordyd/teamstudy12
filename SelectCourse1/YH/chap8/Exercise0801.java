package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
public class Exercise0801 {
    public static String[] loadArray(InputStream is, int n) throws IOException{
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String[] loadArray = new String[n];
        
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            loadArray[i] = str;
        }
        isr.close();
        return loadArray;
    }

    public static void saveArray(OutputStream os, String[] sa){
        PrintStream ps = new PrintStream(os);
        
        for(int i = 0; i<sa.length; i++){
            ps.println(sa[i]);
        }
        ps.close();

    }
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        OutputStream os = System.out;

        saveArray(os, loadArray(is, 3));

        
    }   
}
