/*The hexadecimal digits are the ordinary, base-10 digits '0' through '9' plus the letters 'A' through 'F'. 
In the hexadecimal system, these digits represent the values 0 through 15, respectively.
 Write a function named hexValue that uses a switch statement to find the hexadecimal value of a given character.
  The character is a parameter to the function, and its hexadecimal value is the return value of the function.
   You should count lower case letters 'a' through 'f' as having the same value as the corresponding upper case letters. 
   If the parameter is not one of the legal hexadecimal digits, return -1 as the value of the function.

A hexadecimal integer is a sequence of hexadecimal digits, such as 34A7, ff8, 174204, or FADE.
 If str is a string containing a hexadecimal integer, then the corresponding base-10 integer can be computed as follows:

value = 0;
for ( i = 0; i < str.length();  i++ )
   value = value*16 + hexValue( str.charAt(i) );
Of course, this is not valid if str contains any characters that are not hexadecimal digits. Write a program that reads a string from the user.
 If all the characters in the string are hexadecimal digits, print out the corresponding base-10 value. If not, print out an error message.
*/
package SelectCourse2.Chap04;

public class Prac4_2 {
    public static int hexToDecimal(String inputValue) {
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
                if ('0' <= ch && ch <= '9')
                    return Integer.parseInt(String.valueOf(ch));
                else
                    return -1;
        }
    }

    public static void main(String[] args) {
        String inputValue1 = "34AF";
        String inputValue2 = "ff8";
        String inputValue3 = "124204";

        System.out.println(hexToDecimal(inputValue1));
        System.out.println(hexToDecimal(inputValue2));
        System.out.println(hexToDecimal(inputValue3));
    }
}
