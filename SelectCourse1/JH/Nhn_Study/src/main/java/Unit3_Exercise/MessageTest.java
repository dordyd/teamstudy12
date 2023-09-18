package Unit3_Exercise;

import java.util.Scanner;

public class MessageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tocall = "010-3657-0768";

        MessageText messageText = MessageText.input();
        messageText.input();

        System.out.printf("Receiver phone number : ");
        String receiverPhoneNum = sc.next();

        Message message = new Message();

        message.updateTocall(tocall);
        message.Message(messageText, receiverPhoneNum);
        message.printMessage();

        message.Message(messageText, receiverPhoneNum, tocall);
        message.printMessage();

        message.Message(messageText);
        message.printMessage();


    }
}
