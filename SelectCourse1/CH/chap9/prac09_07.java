package SelectCourse1.CH.chap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class prac09_07 {
    public static boolean fileExists(String fileName) {
        File file = new File(fileName);
        FileReader f;
        try {
            f = new FileReader(file);
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    public static boolean isInt(String str) {
        try {
            int a = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(
                prac09_07.fileExists("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap9/prac09_07.txt"));
        System.out.println(
                prac09_07.fileExists("/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap9/prac09_06.txt"));
        System.out.println(prac09_07.isDouble("1.22"));
        System.out.println(prac09_07.isDouble("asdfasd"));
        System.out.println(prac09_07.isInt("1.22"));
        System.out.println(prac09_07.isInt("122"));

    }
}
