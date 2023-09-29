package Unit9_Exercise;

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


    public int countLines() {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            int countLine = 0;
            while (line != null) {
                countLine++;
                line = br.readLine();
            }

            br.close();

            return countLine;

        } catch (IOException e) {
            System.err.println("Error printing file: " + e.getMessage());
            return -1;
        }

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

    public void print() {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();

        } catch (IOException e) {
            System.err.println("Error printing file: " + e.getMessage());
        }

    }

    public void copy(String newfilename) {
        try {
            FileWriter fw = new FileWriter(newfilename);
            PrintWriter pw = new PrintWriter(fw);

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }

            pw.close();
            br.close();


        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }

    }

    public void delete() {
        if (filename.delete()) {
            System.out.println("Success,File delete");
        } else {
            System.out.println("Fail, File delete");
        }
    }


    public static void main(String[] args) {
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
