package SelectCourse2.YH.code.chap04;
public class Exercise0401 {
    /**
     *
     Exercise 4.1:
     To "capitalize" a string means to change the first letter of each word in the string to upper case (if it is not already upper case).
     For example, a capitalized version of "Now is the time to act!" is "Now Is The Time To Act!".
     Write a subroutine named printCapitalized that will print a capitalized version of a string to standard output.
     The string to be printed should be a parameter to the subroutine.
     Test your subroutine with a main() routine that gets a line of input from the user and applies the subroutine to it
     */
    public static String printCapitalized(String str) {
        String retStr = "";
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                char c = (char) (str.charAt(i) - 32);
                retStr = retStr + c;
            }
            else
                retStr = retStr + str.charAt(i);
        }
        return retStr;
    }

    public static void main(String[] args) {
        String str = "i Am yOunHO";

        str = printCapitalized(str);

        System.out.println(str);
    }
}

