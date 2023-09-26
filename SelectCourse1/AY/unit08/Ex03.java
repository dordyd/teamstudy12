import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
    static char [] c ={ '/', ',', '%'}; 

     public static void printSignExecpt(File f) throws IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String st = br.readLine();

        while(st != null){
            for(int i = 0; i<c.length; i++){
                if(st.charAt(0) == c[i]){
                    System.out.println(st);
                }
            }
            st = br.readLine();
        }

    }
    public static void main(String[] args) throws IOException {
        File f = new File("ex03.txt");
       ///Users/weare0/Desktop/unit/teamstudy12/SelectCourse1/AY/unit08
        printSignExecpt(f);

    }
}