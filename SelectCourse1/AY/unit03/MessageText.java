import java.util.Scanner;

public class MessageText {
    private String text;
    private String code;

    public MessageText(){
        this.text="";
        this.code="";
    }
    public MessageText(String text,String code){
        this.text=text;
        this.code=code;
    }

    public String getCode(){
        return this.code;
    }
    public String getText(){
        return this.text;
    }
    public void setCode(String code){
        this.code=code;
    }
    public void setText(String text){
        this.text=text;
    }
    
    public static MessageText MessageTextInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("message text: ");
        String text = scanner.nextLine();

        System.out.print("message code: ");
        String code = scanner.nextLine();

        return new MessageText(text, code);
    }

}

