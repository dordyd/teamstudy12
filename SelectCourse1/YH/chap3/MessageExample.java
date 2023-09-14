package chap3;

public class MessageExample {
    public static void main(String[] args) {
//        MessageText messageText = MessageText.keyboardInputMessage();// 1번 방법
        MessageText messageText = new MessageText(); // 2번방법
        messageText.keyboardInputMessage();

        Message message = new Message(messageText, "01012341234", "01011111111");

        message.updateNumber("01012345678");
        System.out.println("--------------------------");
        message.printMessage();
        System.out.println("--------------------------");
        System.out.println(message);


    }



}
