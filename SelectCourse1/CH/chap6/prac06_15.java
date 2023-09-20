package SelectCourse1.CH.chap6;

public class prac06_15 {
    static final char[] vocal = { 'a', 'i', 'u', 'e', 'o' };

    private String sender;
    private String receiver;
    private String message;

    public prac06_15(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public void changeSendRec() {
        String tmp = this.receiver;
        this.receiver = this.sender;
        this.sender = tmp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void eliminateVowel() {
        String answer = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            boolean notVowel = true;
            for (char vowel : vocal) {
                if (c == vowel) {
                    notVowel = false;
                }
            }
            if (notVowel) {
                answer += c;
            }
        }
        message = answer;
    }

    public void eliminateWhiteSpace() {
        String answer = "";
        for (int i = 0; i < message.length() - 1; i++) {
            if (message.charAt(i) == ' ' && message.charAt(i + 1) == ' ') {
                continue;
            }
            answer += message.charAt(i);
        }

        message = answer.trim();

    }

    public void eliminateBoth() {
        eliminateVowel();
        eliminateWhiteSpace();
    }

    public static void main(String[] args) {
        prac06_15 test = new prac06_15("01234", "5678", " aeiou test   test  test aeiou ");
        test.eliminateVowel();
        System.out.println(test.getMessage());
        test.setMessage("aeiou test   test  test aeiou");
        test.eliminateWhiteSpace();
        System.out.println(test.getMessage());
        test.setMessage("aeiou test   test  test aeiou");
        test.eliminateBoth();
        System.out.println(test.getMessage());
        test.changeSendRec();
        System.out.println(test.getSender());
        System.out.println(test.getReceiver());

    }
}
