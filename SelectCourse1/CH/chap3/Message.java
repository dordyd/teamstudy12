public class Message {
    private String caller;
    private String sender;
    private String messageText;

    private Message(String caller,String sender,String messageText){
        this.caller = caller;
        this.sender = sender;
        this.messageText = messageText;
    }

    private Message(String sender,String messageText){
        this.sender = sender;
        this.messageText = messageText;
    }

    public static Message MessageOf(MessageText messageText, String caller, String sender){
        return new Message(caller,sender,messageText.getMessageText());
    }
    
    public static Message MessageOfExceptCaller(MessageText messageText, String sender){
        return new Message(sender,messageText.getMessageText());
    }

    public static Message MessageOfMessageText(MessageText messageText){
        return new Message(messageText.getMessageText(), "");
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void getMessageText() {
        System.out.println(messageText); 
    }

    public String toString(){
        return "caller : " + caller + " sender : " + sender + " Message : " + messageText;
    }
}
