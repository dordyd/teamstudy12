import java.io.*;

public class Test {

  public static void main(String[] args) {
    int n=10;
    int[] v = new int[n];

    try{
    FileReader f = new FileReader("dati.txt");
    BufferedReader in = new BufferedReader(f);
    int i=0;
    String linea = in.readLine();
    while (linea!=null) {
      v[i] = Integer.parseInt(linea);
      linea = in.readLine();
      i++;
    }
    f.close();
  }catch (IOException e){
    System.out.println(e.getMessage());
  }
}
}