package chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise0803 {
    static char[] c = {'/', ',', ';'};

    public static void printSignExecpt(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String st = br.readLine();

        while (st != null) {
            for (int i = 0; i < c.length; i++) {
                if (st.charAt(0) == c[i]) {
                    System.out.println(st);
                }
            }
            st = br.readLine();
        }

    }

    public static void main(String[] args) throws IOException {
        File f = new File("SelectCourse1/YH/chap8/ex0803data.txt");
        // FileWriter fw = new FileWriter("SelectCourse1/YH/chap8/ex0803data.txt");
        // PrintWriter pw = new PrintWriter(fw);

        // pw.println(";!@$!@$");
        // pw.println("/!@$!@");
        // pw.println(",!@$!@$");
        // pw.println("!@$!@$");

        // pw.close();
        // fw.close();
        printSignExecpt(f);

    }
}
