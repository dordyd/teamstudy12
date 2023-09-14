import java.util.Scanner;

public class MessageClient {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        String sender = "1234";
        System.out.println("type code");
        String code = scan.nextLine();
        System.out.println("type message");
        String message = scan.nextLine();
        MessageText msgText = new MessageText(code, message);
        System.out.println("type caller number");
        String caller = whatPhoneNum();
        Message msg = Message.MessageOf(msgText, caller, sender);
        System.out.println(msg);
    }

    //3.5 Define an auxiliary static method for reading a phone number
    public static String whatPhoneNum(){  
        return scan.nextLine();
    }
}
