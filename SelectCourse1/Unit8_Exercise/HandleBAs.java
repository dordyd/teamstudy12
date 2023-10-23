package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HandleBAs {
    private File filename;

    public HandleBAs(String filename) {
        this.filename = new File(filename);
    }


    public void interests(double rate) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));
        PrintWriter pw = new PrintWriter(new FileWriter("temp_accounts.txt")); // Temporary file

        String line;
        while ((line = br.readLine()) != null) {
            String name = line;
            String surname = br.readLine();
            double balance = Double.parseDouble(br.readLine());


            double newBalance = balance + balance / 100 * rate;

            pw.println(name);
            pw.println(surname);
            pw.println(newBalance);
        }

        br.close();
        pw.close();

        File tempFile = new File("temp_accounts.txt");
        tempFile.renameTo(filename);

    }

    public void printNegative() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));

        String line;
        while ((line = br.readLine()) != null) {
            String name = line;
            String surname = br.readLine();
            double balance = Double.parseDouble(br.readLine());

            if (balance < 0) {
                System.out.println(name + " / " + surname + " / " + balance);
            }


        }

        br.close();

    }


    public static void main(String[] args) throws IOException {

        HandleBAs handleBAs = new HandleBAs(
                "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/java/Unit8_Exercise/HandleBAs.txt");

        handleBAs.interests(3.5);
        handleBAs.printNegative();
    }
}
