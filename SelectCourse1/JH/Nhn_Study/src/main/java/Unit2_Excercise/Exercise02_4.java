package Unit2_Excercise;

import javax.swing.JOptionPane;

public class Exercise02_4 {
    public static void main(String[] args) {
//        String str = JOptionPane.showInputDialog("insert string");
//
//        String[] arr = str.split("");
//        String change = arr[str.length() - 1];
//        arr[str.length() - 1] = arr[0];
//        arr[0] = change;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf(arr[i]);
//        }
        
        String str = JOptionPane.showInputDialog("Insert String");
        String afterstr = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        System.out.println(afterstr);

    }
}
