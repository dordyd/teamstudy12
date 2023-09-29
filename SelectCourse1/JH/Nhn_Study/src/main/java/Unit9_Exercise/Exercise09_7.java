package Unit9_Exercise;

import java.io.File;

public class Exercise09_7 {

    public static boolean fileExists(String filename) {
        try {
            File file = new File(filename);
            return file.exists();
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static boolean isInt(String inputNum) {
        try {
            Integer.parseInt(inputNum);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String inputDouble) {
        try {
            Double.parseDouble(inputDouble);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("File exists : " + fileExists("Exercise09_7"));


        System.out.println("IsInt : " + isInt("1234"));


        System.out.println("IsDouble : " + isDouble("1.2345"));

    }
}
