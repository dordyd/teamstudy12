package chap3;

import java.util.Scanner;

public class MessageExample {
    public static void main(String[] args) {
        MessageText messageText = MessageText.keyboardInputMessage();// 1번 방법
//        MessageText messageText = new MessageText(); // 2번방법
//        messageText.keyboardInputMessage();

        Message message = new Message(messageText, "01012341234", "01011111111");

        message.updateNumber("01012345678");

        System.out.println("--------------------------");
        message.printMessage(); // 사용자는 내부의 구조를 몰라야함.

        System.out.println("--------------------------");
        System.out.println(message);


        String receiverPhoneNumber = message.getSenderNumber();
        MessageText messageTextCorrespond = MessageText.keyboardInputMessage();

        System.out.print("input sender receiver: ");
        Scanner scanner = new Scanner(System.in);
        String newreceiverPhoneNumber = scanner.nextLine();
        Message messageCorrespond = new Message(messageTextCorrespond, receiverPhoneNumber);
        messageCorrespond.setSenderNumber(newreceiverPhoneNumber);

        System.out.println(messageCorrespond);
    }
}
