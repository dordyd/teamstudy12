import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {//재귀로
    public static int readFile(String file) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        int c=br.read();
        int i=0;
        String line= br.readLine();
        while (line!= null) {
            i+=readFile(line);
        }
        return i;
        // if(c==1) System.out.print("*");
        // else readFile(f, br);;
    }
    public static void main(String[] args) {
        
    }
}
