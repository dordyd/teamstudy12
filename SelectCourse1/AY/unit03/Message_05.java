import java.util.Scanner;

public class Message_05 {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
       String mTxt=sc.nextLine();
       String mCode=sc.nextLine();

        MessageText messagetext=new MessageText(mTxt,mCode);

        String senderNumber=sc.nextLine();
       // String messageText=messagetext.getText();

        Message message=new Message(messagetext, senderNumber);

        message.printMessage();

        sc.close();
    }
}