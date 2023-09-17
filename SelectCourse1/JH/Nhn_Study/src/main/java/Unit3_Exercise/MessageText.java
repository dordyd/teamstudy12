package Unit3_Exercise;

import java.util.Scanner;

public class MessageText {

    private String code;
    private String message;


    public MessageText(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static MessageText input() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Code : ");
        String code = sc.nextLine();

        System.out.printf("Message : ");
        String message = sc.nextLine();

        return new MessageText(code, message);
    }

//    private void setter(String code, String message) {
//        this.code = code;
//        this.message = message;
//    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }


}
