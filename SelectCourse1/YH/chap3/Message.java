package chap3;

public class Message {
    MessageText messageText;
    String toCallNumber;
    String senderNumber;

    public Message(MessageText messageText, String toCallNumber, String senderNumber) {
        this.messageText = messageText;
        this.toCallNumber = toCallNumber;
        this.senderNumber = senderNumber;
    }

    public Message(MessageText messageText, String senderNumber) {
        this.messageText = messageText;
        this.senderNumber = senderNumber;
    }

    public Message(MessageText messageText) {
        this.messageText = messageText;
    }

    public void updateNumber(String senderNumber){
        this.senderNumber = senderNumber;
    }

    public void printMessage(){
        System.out.println(messageText);
    }

    @Override
    public String toString() {
        return messageText + "\ntoCallNumber = " + toCallNumber + "\nsenderNumber = " + senderNumber;
    }
}

