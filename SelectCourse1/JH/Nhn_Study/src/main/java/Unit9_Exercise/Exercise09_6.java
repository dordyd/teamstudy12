package Unit9_Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise09_6 {
    public static void main(String[] args) {
        checkFile("Exercise09_6.txt");
    }

    public static void checkFile(String filename) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                if (line.length() > 80) {
                    throw new ExceptionLineTooLong();
                }
            }
        } catch (ExceptionLineTooLong e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            System.err.println("File not found : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException : " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.err.println("Closing file Error : " + e.getMessage());
            }
        }
    }
}
