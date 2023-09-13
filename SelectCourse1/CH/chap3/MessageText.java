import java.util.Scanner;

public class MessageText {

    private String code;
    private String messageText;
    
    public MessageText(String code, String messageText){
        this.code = code;
        this.messageText = messageText;
    }
    
    public MessageText messageTextOf(){
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
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
