package SelectCourse2.YH.code.chap08.exercise0803;

/**
 * XVII -> 17
 * MCMLIII -> 1953
 * MMMCCCIII -> 3303
 * MCMXCV -> 1995
 */
public class RomanNumeral {
    String roman;

    int num;

    public int getNum() {
        return num;
    }

    public RomanNumeral(String str){
        this.roman = str;
        num = romanToNum(str);
    }


    public int romanToNum(String str){
        int result = 0;
        for(int i = 0; i<str.length()-1; i++){
            int letterVal = matchChar(str.charAt(i));
            if(matchChar(str.charAt(i+1))> letterVal){
                result = result - letterVal;
            }
            else
                result = result + letterVal;
        }
        result = result+matchChar(str.charAt(str.length()-1));
        return result;
    }

    public int matchChar(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    public static void main(String[] args) {
        RomanNumeral romanNumeral = new RomanNumeral("MMMM");

        System.out.println(romanNumeral.getNum());
    }
}
