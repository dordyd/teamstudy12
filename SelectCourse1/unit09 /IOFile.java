import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;


public class IOFile {
    String filename;

    public IOFile(String filename) {
        this.filename = filename;
    }

    public int countLines() {
        int n = 0;
        try (FileReader fr = new FileReader(filename);
             BufferedReader in = new BufferedReader(fr)) {

            String line = in.readLine();
            while (line != null) {
                n++;
                line = in.readLine();
            }
        }catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
        return n;
    }

    public void write(OutputStream os) {
        try (FileInputStream is = new FileInputStream(filename);
             BufferedInputStream bis = new BufferedInputStream(is);
             OutputStream out = os) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public void print() {
        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public void copy(String destFilename) {
        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(destFilename);
             PrintWriter pw = new PrintWriter(fw)) {

            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public void delete() {
        File f = new File(filename);
        if (f.exists() && f.isFile()) {
            if (f.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.err.println("Failed to delete the file.");
            }
        } else {
            System.err.println("File does not exist or is not a regular file.");
        }
    }
}
