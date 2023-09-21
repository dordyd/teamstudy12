package chap3;

public class Message {
    private MessageText messageText;
    private String toCallNumber;
    private String senderNumber;

    public Message(MessageText messageText, String toCallNumber, String senderNumber) {
        this.messageText = messageText;
        this.toCallNumber = toCallNumber;
        this.senderNumber = senderNumber;
    }

    public Message(MessageText messageText, String senderNumber) {
        this.messageText = messageText;
        this.toCallNumber = senderNumber;
    }

    public MessageText getMessageText() {
        return messageText;
    }

    public String getToCallNumber() {
        return toCallNumber;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public Message(MessageText messageText) {
        this.messageText = messageText;
    }

    public void updateNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public void printMessage() {
        System.out.println(messageText);
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    @Override
    public String toString() {
        return messageText + "\ntoCallNumber = " + toCallNumber + "\nsenderNumber = " + senderNumber;
    }
}

