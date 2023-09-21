package chap3;

import java.util.Scanner;

public class MessageText {
    private String code;
    private String message;

    public MessageText(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static MessageText keyboardInputMessage() { //1번 방법
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter code :");
        String code = scanner.nextLine();
        System.out.print("enter message");
        String message = scanner.nextLine();
        return new MessageText(code, message);
    }
//    public MessageText(){} // 2번 방법
//    public void keyboardInputMessage() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter code :");
//        this.code = scanner.nextLine();
//        System.out.print("enter message: ");
//        this.message = scanner.nextLine();
//    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "code = " + this.getCode() + "\nmessage = " + this.getMessage();
    }
}
