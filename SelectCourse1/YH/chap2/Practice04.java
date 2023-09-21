package chap2;

import javax.swing.JOptionPane;

public class Practice04 {
    public static void main(String[] args) {
        String notEmptyLiteral = JOptionPane.showInputDialog("insert Literal");

        notEmptyLiteral.substring(0, 1);
        String copy = notEmptyLiteral.substring(notEmptyLiteral.length() - 1, notEmptyLiteral.length())
                + notEmptyLiteral.substring(1, notEmptyLiteral.length() - 1)
                + notEmptyLiteral.substring(0, 1);

        String first = notEmptyLiteral.substring(0, 1);
        String last = notEmptyLiteral.substring(notEmptyLiteral.length() - 1, notEmptyLiteral.length());
        System.out.println(last + notEmptyLiteral.substring(1, notEmptyLiteral.length() - 1) + first);

        System.out.println(copy);
        System.exit(0);
//
    }
}
