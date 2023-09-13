package SelectCourse1.YH.chap2;

import javax.swing.JOptionPane;

public class Practice05 {
    public static void main(String[] args) {
        String notEmptyLiteral = JOptionPane.showInputDialog("insert Literal");
        StringBuffer buffer = new StringBuffer(notEmptyLiteral);
        buffer.replace(0, 1, buffer.substring(notEmptyLiteral.length()-1, notEmptyLiteral.length()));
        buffer.replace(buffer.length()-1, buffer.length(), notEmptyLiteral.substring(0, 1));
        System.out.println(buffer);
        System.out.println(notEmptyLiteral);

        System.exit(0);
    }
}
