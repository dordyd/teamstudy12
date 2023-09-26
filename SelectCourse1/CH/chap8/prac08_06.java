import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class prac08_06 {
    File file;
    FileReader f;
    BufferedReader in;

    public prac08_06(String input) throws FileNotFoundException {
        this.file = new File(input);
        this.f = new FileReader(input);
        this.in = new BufferedReader(f);
    }

    public int countLines() throws IOException {
        int n = 0;
        String line = in.readLine();
        while (line != null) {
            n++;
            line = in.readLine();
        }
        return n;
    }

    public void write(OutputStream os) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(os);

        String line = in.readLine();
        while (line != null) {
            osw.write(line);
            line = in.readLine();
        }
        osw.flush();
    }

    public void print() throws IOException {
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }

    }

    public void copy(String filename) throws IOException {
        FileWriter f1 = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f1);
        String line = in.readLine();
        while (line != null) {
            out.println(line);
            line = in.readLine();
            out.flush();
        }
        f1.close();
    }

    public void delete() {
        file.delete();
    }

    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        prac08_06 a = new prac08_06("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/prac08_06.txt");
        a.print();
        System.out.println(a.countLines());
        a.write(os);
        a.copy("08copy");
        a.delete();

    }
}
