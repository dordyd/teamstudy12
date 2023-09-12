package Unit2_Excercise;

import javax.swing.JOptionPane;

public class Exercise02_5 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Insert String");
        StringBuffer strBuffer = new StringBuffer(str);

        String afterstr = strBuffer.substring(strBuffer.length() - 1) + strBuffer.substring(1, strBuffer.length() - 1) +
                strBuffer.substring(0, 1);

        System.out.println(afterstr);

    }
}
