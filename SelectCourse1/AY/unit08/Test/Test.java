package Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test{
public static void saveArray(String[] v, String filename)throws IOException {
FileWriter f = new FileWriter(filename); 
PrintWriter out = new PrintWriter(f); 

for (int i = 0; i < v.length; i++) 
out.println(v[i]);
out.close(); 
f.close(); 
}
public static void main(String[] args) throws IOException {
    String fileName="test.txt";
    File f=new File("test.txt");
    String v[]={"a","pin","jake"};
    saveArray(v,fileName);
}
}