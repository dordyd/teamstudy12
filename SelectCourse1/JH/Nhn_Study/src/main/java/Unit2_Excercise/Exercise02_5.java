package Unit2_Excercise;

import javax.swing.JOptionPane;

public class Exercise02_5 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Insert String");
        StringBuffer strBuffer = new StringBuffer(str);

        String temp = strBuffer.substring(0, 1);

        strBuffer.replace(0, 1, strBuffer.substring(strBuffer.length() - 1));
        strBuffer.replace(strBuffer.length() - 1, strBuffer.length(), temp);

        System.out.println(strBuffer);
    }
}
