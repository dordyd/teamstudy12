package Unit3_Excercises;

public class Message {
    private String toCall;
    private String sender;
    private String text;

    public void Message(MessageText messageText, String sender, String toCall) {
        this.toCall = toCall;
        this.sender = sender;
        this.text = messageText.getMessage();
    }

    public void Message(MessageText messageText, String sender) {
        this.sender = sender;
        this.text = messageText.getMessage();
    }

    public void Message(MessageText messageText) {
        this.text = messageText.getMessage();
    }

    public void updateTocall(String phoneNumber) {
        this.toCall = phoneNumber;
    }


    public void printMessage() {
        System.out.println("======================");
        System.out.println("Message : " + this.text);
        System.out.println("To Call : " + this.toCall);
        System.out.println("Sender : " + this.sender);
        System.out.println("======================");
    }

}
