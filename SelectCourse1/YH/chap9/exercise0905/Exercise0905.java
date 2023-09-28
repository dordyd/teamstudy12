package chap9.exercise0905;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Exercise0905 {
    // static String filepath ="SelectCourse1/YH/chap9/exercise0905/ex0905data.txt";
    static String filepath = "SelectCourse1/YH/chap9/exercise090t/ex090qwerqwerdata.txt";

    public static int countLines() throws IOException {
        File file = new File(filepath);
        int count = 1;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            while (br.readLine() == null) {
                count++;
            }
            return count;
        } catch (FileNotFoundException e) {
            System.out.println("파일 경로에 아무것도 없습니다.");
            return -1;
        }
    }

    public static void write(OutputStream os) throws IOException {
        String data = "This is a sample text to write to the output stream.";
        byte[] bytes = data.getBytes();
        os.write(bytes);
        os.close();
    }

    public static void print() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
    }

    public static void copy(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fileWriter);
        BufferedReader br;

        br = new BufferedReader(new FileReader(new File(filepath)));

        String copyStr = br.readLine();
        if (copyStr == null) {
            throw new NullPointerException("해당 파일에는 아무 데이터도 입력되어 있지 않습니다.");
        }

        while (copyStr != null) {
            pw.println(copyStr);
            copyStr = br.readLine();
        }

        pw.close();
        fileWriter.close();
    }

    public static void delete() {


        File f = new File(filepath);
        f.delete();

    }

    public static void main(String[] args) throws IOException {
        System.out.println(countLines());
        print();
        String copyfilepath = "SelectCourse1/YH/chap9/exercise0905/ex0906copydata.txt";
        copy(copyfilepath);
        delete();
        System.out.println();
        write(new FileOutputStream(filepath));

    }
}
