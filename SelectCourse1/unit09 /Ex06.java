import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class Ex06 {
    public static void main(String[] args) {
        int n=10;
    int[] v = new int[n];

    try{
    FileReader f = new FileReader("dati.txt");
    BufferedReader in = new BufferedReader(f);
    int i=0;
    String linea = in.readLine();
    while (linea!=null) {
        if(linea.length()>80){
            throw new ExceptionLineTooLong("The strings is too long");
        }
      v[i] = Integer.parseInt(linea);
      linea = in.readLine();
      i++;
    }
    f.close();
  }catch(FileNotFoundException e){
    System.out.println(e.getMessage());
  }catch (IOException e){
    System.out.println(e.getMessage());
  }catch (ExceptionLineTooLong e){
    System.out.println(e.getMessage());
  }
    }
}
