package Chapter4;

public class Exercise4_1 {

    public static String printCapitalized(String inputString) {
        StringBuilder outputString = new StringBuilder();

        boolean toCapitalizeFlag = true;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                if (toCapitalizeFlag) {
                    ch = Character.toUpperCase(ch);
                    toCapitalizeFlag = false;
                }
            } else if (ch == ' ') {
                toCapitalizeFlag = true;
            }
            outputString.append(ch);
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        String inputString = "now is the time to act!";
        String capitalizedString = printCapitalized(inputString);
        System.out.println(capitalizedString);
    }
}
