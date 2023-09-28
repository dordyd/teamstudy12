package chap9;

public class Exercise0906 {

    public static class ExceptionLineTooLing extends Exception {

        public ExceptionLineTooLing(String message) {
            super(message);
        }
    }

    public static void strInputPrint(String str) throws ExceptionLineTooLing {
        if (str.length() >= 80) {
            throw new ExceptionLineTooLing("The strings is too long");
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        try {
            String str =
                    "qeifhoqwklmfkdalmxvnqoirehjgiopwkelmfd,s cjngjop;l,2few dvfbjiokwel;,dsfmkgbniejrowkpdls;,qeifhoqwklmfkdalmxvnqoirehjgiopwkelmfd,s cjngjop;l,2few dvfbjiokwel;,dsfmkgbniejrowkpdls;,cc";
            strInputPrint(str);
        } catch (ExceptionLineTooLing e) {
            System.out.println(e.getMessage());
        }
    }
}
