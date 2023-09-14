import java.util.Scanner;

public class MessageText {

    static Scanner scan = new Scanner(System.in);

    private String code;
    private String messageText;
    
    public MessageText(String code, String messageText){
        this.code = code;
        this.messageText = messageText;
    }
    
    public static MessageText messageTextOf(){
        System.out.println("type code");
        String code = scan.nextLine();
        System.out.println("type message");
        String messageText = scan.nextLine();
        return new MessageText(code, messageText);
    }

    public String getCode() {
        return code;
    }

    public String getMessageText() {
        return messageText;
    }
    
    
}
