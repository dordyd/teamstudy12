import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class prac08_07 {
    File file;
    FileReader f;
    BufferedReader in;

    public prac08_07(String string) throws FileNotFoundException {
        this.file = new File(string);
        this.f = new FileReader(string);
        this.in = new BufferedReader(f);
    }

    public void interests(double rate) throws IOException {
        File file1 = new File("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/ex.txt");
        BufferedWriter bw = new BufferedWriter(
                new FileWriter(file1));
        String line = in.readLine();
        int i = 0;
        while (line != null) {

            if (i == 2) {
                double money = Integer.parseInt(line);
                money *= rate;
                bw.write(Double.toString(money) + "\n");

                i = 0;
            } else {
                bw.write(line + "\n");
                i++;
            }
            line = in.readLine();
        }
        file.delete();
        file1.renameTo(file);
        bw.close();
    }

    public void printNegative() throws IOException {
        String line = "";
        int i = 0;
        String[] tmpArr = new String[3];
        while (line != null) {
            line = in.readLine();
            tmpArr[i] = line;
            if (i == 2) {
                if (Integer.parseInt(line) < 0) {
                    System.out.println(Arrays.toString(tmpArr));
                }
                i = 0;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        prac08_07 a = new prac08_07("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/prac08_07.txt");
        // a.printNegative();
        a.interests(1.1);
    }
}
