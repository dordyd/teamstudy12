package SelectCourse1.CH.chap2;
import javax.swing.JOptionPane;

public class practice02_5 {
    public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog("문자열을 삽입하세요");
        StringBuffer sb = new StringBuffer(inputString);
        String tmp = sb.substring(0, 1);
        sb.replace(0,1, sb.substring(sb.length()-1));
        sb.replace(sb.length()-1,sb.length(),tmp);
        System.out.println(sb);
    }
}
