package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOFile {

    private File filename;

    public IOFile(String filename) {
        this.filename = new File(filename);
    }

    public int countLines() throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        int countLine = 0;
        while (line != null) {
            countLine++;
            line = br.readLine();
        }

        fr.close();

        return countLine;
    }

//    public void write(OutputStream os) throws IOException {
//        FileInputStream fis = new FileInputStream(filename);
//
//        byte[] buffer = new byte[1024];
//        int bytesRead;
//        while ((bytesRead = fis.read(buffer)) != -1) {
//            os.write(buffer, 0, bytesRead);
//        }
//
//        os.close();
//    }

    public void print() throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        fr.close();
    }

    public void copy(String newfilename) throws IOException {
        FileWriter fw = new FileWriter(newfilename);
        PrintWriter pw = new PrintWriter(fw);

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }

        fr.close();
        pw.close();
        fw.close();
    }

    public void delete() {
        filename.delete();
    }


    public static void main(String[] args) throws IOException {
        IOFile file = new IOFile(
                "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/java/Unit8_Exercise/IOFile.txt");

        System.out.println(file.countLines());
        System.out.println("============================");

//        OutputStream os = System.out;
//        file.write(os);

        file.print();
        System.out.println("============================");

        file.copy("IOFileCopy.txt");
        System.out.println("============================");


        file.delete();


    }
}
