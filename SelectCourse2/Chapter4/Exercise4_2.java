package Chapter4;

public class Exercise4_2 {

    public static int toDecimal(String inputValue) {
        int decimal = 0;
        for (int i = 0; i < inputValue.length(); i++) {
            decimal = decimal * 16 + hexValue(inputValue.charAt(i));
        }
        return decimal;
    }

    private static int hexValue(char c) {
        char ch = Character.toUpperCase(c);
        switch (ch) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return Integer.parseInt(String.valueOf(ch));
        }
    }


    public static void main(String[] args) {
        String inputValue1 = "34AF";
        String inputValue2 = "ff8";
        String inputValue3 = "124204";

        System.out.println(toDecimal(inputValue1));
        System.out.println(toDecimal(inputValue2));
        System.out.println(toDecimal(inputValue3));
    }
}
