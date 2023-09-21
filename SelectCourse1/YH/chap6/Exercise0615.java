package chap6;

public class Exercise0615 {
    public static class Message {
        private String sender;
        private String receiver;
        private String message;

        public Message(String sender, String receiver, String message) {
            this.sender = sender;
            this.receiver = receiver;
            this.message = message;
            compressMessage();
        }

        public void changeSenderReceiver() {
            String temp = receiver;
            receiver = sender;
            sender = temp;
        }

        private void compressMessage() {
            message = deleteWhiteEdge(message);
            message = deleteWhiteSpace(message);
        }

        private String deleteWhiteEdge(String str) {
            if (str.charAt(0) == ' ') {
                str = deleteWhiteEdge(str.substring(1));
            }
            if (str.charAt(str.length() - 1) == ' ') {
                str = deleteWhiteEdge(str.substring(0, str.length() - 1));
            }
            return str;
        }

        private String deleteWhiteSpace(String str) {
            boolean whiteSpace = false;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ' ') {
                    if (whiteSpace == true) {
                        str = str.substring(0, i) + str.substring(i + 1);
                        i--;
                    } else {
                        whiteSpace = true;
                    }
                } else {
                    whiteSpace = false;
                }
            }
            return str;
        }

        public String deleteGather() {
            String str = this.message;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'o' ||
                        str.charAt(i) == 'u') {
                    str = str.substring(0, i) + str.substring(i + 1);
                }
            }
            return str;
        }


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


        public String getMessage() {
            return message;
        }


        public void setMessage(String message) {
            this.message = message;
        }


    }

    public static void main(String[] args) {
        String message = "    zz     za    qwerqwerqwer  ";
        Message message2 = new Message("윤호", "중민", message);
        System.out.println(message2.getMessage());
        System.out.println(message2.deleteGather());
    }
}
