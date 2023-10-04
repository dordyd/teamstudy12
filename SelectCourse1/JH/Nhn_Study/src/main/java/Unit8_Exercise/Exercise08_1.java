package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Exercise08_1 {


    public static String[] loadArray(InputStream is, int n) throws IOException {

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String[] loadArray = new String[n];

        for (int i = 0; i < n; i++) {
            loadArray[i] = br.readLine();
        }

        return loadArray;
    }

    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        for (String str : sa) {
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
    }


    public static void main(String[] args) throws IOException {

        String[] inputStrings = {
                "Hello",
                "World",
                "Java",
                "IO",
                "Example"
        };


        InputStream is = System.in;
        loadArray(is, 3);


        OutputStream os = System.out;
        saveArray(os, inputStrings);


//        try {
//            String[] inputStrings = {
//                    "Hello",
//                    "World",
//                    "Java",
//                    "IO",
//                    "Example"
//            };
//
//            // Save the array to a file
//            FileOutputStream fos = new FileOutputStream("Exercise08_1.txt");
//            saveArray(fos, inputStrings);
//            fos.close();
//
//            // Load the array from the file
//            FileInputStream fis = new FileInputStream("Exercise08_1.txt");
//            String[] loadedStrings = loadArray(fis, 3);
//
//            // Print the loaded strings
//            for (String str : loadedStrings) {
//                System.out.println(str);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
    }

}
