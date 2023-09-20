package Unit6_Exercise;

public class Message {

    private String sender;
    private String receiver;
    private String text;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    // Getter and Setter methods for sender, receiver, and text
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Method to swap sender and receiver
    public void swapSenderReceiver() {
        String temp = sender;
        sender = receiver;
        receiver = temp;
    }

    // Method to compress the message text
    public void compressMessage(int option) {
        switch (option) {
            case 1:
                // Eliminate leading/trailing whitespace and replace multiple spaces with a single space
                text = text.trim().replaceAll("\\s+", " ");
                break;
            case 2:
                // Eliminate all vowels from the text
                text = text.replaceAll("[aeiouAEIOU]", "");
                break;
            case 3:
                // Perform both (1) and (2)
                text = text.trim().replaceAll("\\s+", " ").replaceAll("[aeiouAEIOU]", "");
                break;
            default:
                System.out.println("Invalid compression option.");
        }
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\nMessage: " + text;
    }

    public static void main(String[] args) {
        Message message = new Message("Alice", "Bob", "   Hello   there!  How    are you?   ");
        System.out.println("Original Message:\n" + message);

        message.swapSenderReceiver();
        System.out.println("\nAfter Swapping Sender and Receiver:\n" + message);

        message.compressMessage(1);
        System.out.println("\nAfter Compression (Option 1):\n" + message);

        message.compressMessage(2);
        System.out.println("\nAfter Compression (Option 2):\n" + message);

        message.compressMessage(3);
        System.out.println("\nAfter Compression (Option 3):\n" + message);
    }
}
