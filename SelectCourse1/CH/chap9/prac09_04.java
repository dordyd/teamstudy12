package SelectCourse1.CH.chap9;

import java.io.*;

public class prac09_04 {

    public static void main(String[] args) throws IOException {
        int n = 10;
        int[] v = new int[n];
        FileReader f = new FileReader("dati.txt"); // FileNotFoundException
        BufferedReader in = new BufferedReader(f);
        int i = 0;
        String linea = in.readLine(); // IOException
        while (linea != null) {
            v[i] = Integer.parseInt(linea); // NumberFormatException
            linea = in.readLine();
            i++;
        }
        f.close();
    }
}
