package chap9.exercise0907;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise0907 {
    public static boolean fileExists(String str) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(new File(str));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println(str + " is exist.");
        return true;
    }

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println(str + " can change Integertype");
        return true;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println(str + " can change Doubleetype");
        return true;
    }

    public static void main(String[] args) throws IOException {
        String filepath = "SelectCourse1/YH/chap9/exercise0907/ex0907.txt";
        String filepathCopy = "SelectCourse1/YH/chap9/exercise0907/ex0907copy.txt";

        fileExists(filepathCopy); //FileNotFoundException
        fileExists(filepath);
        System.out.println();
        String str1 = "1qwer111231425"; // NumberformatException
        String str2 = "12030129301920913209"; // NumberformatException
        String str3 = "1234";
        isInt(str1);
        isInt(str2);
        isInt(str3);
        System.out.println();
        isDouble(str1);
        isDouble(str2);
        isDouble(str3);

    }
}
