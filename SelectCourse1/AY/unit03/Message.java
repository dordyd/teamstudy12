//import java.util.Scanner;

public class Message {
    private String callNumber;
    private String senderNumber;
    private MessageText messageText;

    
    public Message(MessageText messageText, String callNumber, String senderNumber) {
        this.messageText = messageText;
        this.callNumber = callNumber;
        this.senderNumber = senderNumber;
    }

    public Message(MessageText messageText, String senderNumber) {
        this(messageText, "", senderNumber);
    }

    public Message(MessageText messageText) {
        this(messageText, "", "");
    }

    public void updateCallNumber(String newCallNumber) {
        this.callNumber = newCallNumber;
    }

    public void printMessage() {
        System.out.println("Call Number: " + callNumber);
        System.out.println("Sender Number: " + senderNumber);
        System.out.println("Message Text: " + messageText.getText());
    }

   
}