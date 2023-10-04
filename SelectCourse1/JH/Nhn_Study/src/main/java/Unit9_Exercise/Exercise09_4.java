package Unit9_Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exercise09_4 {

    public static void main(String[] args) {
        int n = 10;
        int[] v = new int[n];
        FileReader f = null;
        BufferedReader in = null;

        try {
            f = new FileReader("dati.txt");
            in = new BufferedReader(f);

            int i = 0;
            String linea = in.readLine();
            while (linea != null) {
                try {
                    v[i] = Integer.parseInt(linea);
                } catch (NumberFormatException e) {
                    System.err.println("NumberFormatException : " + e.getMessage());
                }
                linea = in.readLine();
                i++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOExeption : " + e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (f != null) {
                    f.close();
                }
            } catch (IOException e) {
                System.err.println("Closing file Error : " + e.getMessage());
            }
        }

    }

}
