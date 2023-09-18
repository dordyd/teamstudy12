import java.util.Scanner;

public class MessageTest {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
       String mText=sc.nextLine();
       String mCode=sc.nextLine();

        MessageText messagetext=new MessageText(mText,mCode);

        String senderNumber=sc.nextLine();
       // String messageText=messagetext.getText();

        Message message=new Message(messagetext, senderNumber);

        message.printMessage();

        sc.close();
    }
}