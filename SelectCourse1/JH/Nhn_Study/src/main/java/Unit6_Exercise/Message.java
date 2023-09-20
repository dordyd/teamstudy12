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


    public void swapSenderReceiver() {
        String temp = sender;
        sender = receiver;
        receiver = temp;
    }
    

    public void moreThanOneWhiteSpaceToSingle() {
        text = text.trim().replaceAll("\\s+", " ");
    }

    public void eliminateOfAllVowels() {
        text = text.replaceAll("[aeiouAEIOU]", "");
    }

    public void all() {
        moreThanOneWhiteSpaceToSingle();
        eliminateOfAllVowels();
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\nMessage: " + text;
    }

    public static void main(String[] args) {
        Message message = new Message("정훈", "윤호", "   Hey,  what  are  you   doing?   ");

        System.out.println("<Original text>");
        System.out.println(message);
        System.out.println("===========================================================");

        System.out.println("<After Swapping Sender Receiver>");
        message.swapSenderReceiver();
        System.out.println(message);
        System.out.println("===========================================================");

        System.out.println("<After Eliminate White Space>");
        message.moreThanOneWhiteSpaceToSingle();
        System.out.println(message);
        System.out.println("===========================================================");

        System.out.println("<After Eliminate All Vowels>");
        message.eliminateOfAllVowels();
        System.out.println(message);
        System.out.println("===========================================================");

        System.out.println("<After All>");
        message.all();
        System.out.println(message);
    }
}
