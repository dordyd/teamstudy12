package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
    public static void main(String[] args) throws IOException {
        System.out.println(loadArray("testReader.txt"));
    }
    public static String[] loadArray (String filename) throws IOException {
        // We first read the file to count the number of line
        FileReader f = new FileReader(filename);
        BufferedReader in = new BufferedReader(f);
        int n = 0;
        String line = in.readLine();
        while (line != null) {
          n++;
          line = in.readLine();
        }
        f.close();
      
        // Creation of the array
        String[] v = new String[n];
      
        // Loop to read the strings from the file into the array
        f = new FileReader(filename);
        in = new BufferedReader(f);
        int i = 0;
        line = in.readLine();
        while ((line != null) && (i < n)) {
          v[i] = line;
          line = in.readLine();
          i++;
        }
        f.close();
        return v;
      }
}
