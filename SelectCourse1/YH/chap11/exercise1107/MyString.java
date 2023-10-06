package chap11.exercise1107;

public class MyString {
    char c;
    MyString next;

    public MyString(char c) {
        this.c = c;
    }

    public MyString() {
    }

    public static MyString concat(MyString str, char c) {
        MyString p = new MyString(c);
        MyString copy = str;
        while (copy.next != null) {
            copy = copy.next;
        }
        copy.next = p;
        return str;
    }

    @Override
    public String toString() {
        return "" + c;
    }

    public static void print(MyString str) {
        while (str != null) {
            System.out.print(str);
            str = str.next;
        }
    }

    public static int length(MyString str) {
        int count = 0;
        while (str != null) {
            count++;
            str = str.next;
        }
        return count;
    }

    public static int charCount(MyString str, char c) {
        MyString copy = str;
        int count = 0;
        while (copy != null) {
            if (copy.c == c) {
                count++;
            }
            copy = copy.next;
        }
        return count;
    }

    public static MyString[] subString(MyString str, char c) { // ** 사이드 이펙트 **
        int count = MyString.charCount(str, c);
        MyString[] myStr = new MyString[count + 1];
        int index = 0;
        MyString copy = new MyString();
        copy.next = str;
        str = copy;
        myStr[0] = copy.next;
        while (copy.next != null) {
            if (copy.next.c == c) {
                index++;
                myStr[index] = copy.next.next;
                MyString temp = copy.next.next;
                copy.next.next = null;
                copy.next = null;
                copy = temp;
                continue;
            }
            copy = copy.next;
        }
        return myStr;
    }

    public static char charAt(MyString str, int num) {
        for (int i = 0; i < num; i++) {
            str = str.next;
        }
        return str.c;
    }

    public static int indexOf(MyString str, char c) {
        int count = 0;
        while (str != null) {
            if (str.c == c) {
                return count;
            }
            count++;
            str = str.next;
        }
        throw new IllegalArgumentException("없음");
    }

    public static boolean equals(MyString str1, MyString str2) {
        if (MyString.length(str1) != MyString.length(str2)) {
            return false;
        }
        while (str1 != null) {
            if (str1.c != str2.c) {
                return false;
            }
            str2 = str2.next;
            str1 = str1.next;
        }
        return true;
    }

    public static MyString toUpperCase(MyString str) {
        MyString upper = new MyString();
        MyString returnAdrr = upper;

        while (str != null) {
            if ('a' <= str.c && str.c <= 'z') {
                concat(upper, (char) (str.c + 'A' - 'a'));
            } else {
                concat(upper, str.c);
            }
            str = str.next;
        }
        return returnAdrr.next;
    }

    public static MyString parseInt(MyString str) {
        MyString intChar = new MyString();
        while (str != null) {
            if ('0' <= str.c && str.c <= '9') {
                MyString.concat(intChar, str.c);
            }
            str = str.next;
        }
        return intChar.next;
    }

    public static void main(String[] args) {
        MyString str = new MyString('a');
        MyString.concat(str, 'b');
        MyString.print(str);
        System.out.println();
        MyString str1 = new MyString('a');
        MyString.concat(str1, 'b');
        MyString.print(str1);
        System.out.println();
        System.out.println(MyString.equals(str, str1));
        MyString.concat(str1, ' ');
        MyString.concat(str1, 'b');
        MyString.concat(str1, ' ');
        MyString.concat(str1, 'b');
        System.out.println(MyString.charCount(str1, 'b'));
        MyString.print(str1);
        System.out.println();
//        MyString[] subStr = MyString.subString(str1, ' ');
//        for (MyString myString : subStr) {
//            MyString.print(myString);
//            System.out.println();
//        }

        System.out.println(MyString.indexOf(str1, 'b'));
        System.out.println("\'" + MyString.charAt(str1, 3) + "\'");

        MyString.print(toUpperCase(str1));
        System.out.println();
        MyString str3 = new MyString('a');
        MyString.concat(str3, '1');
        MyString.concat(str3, '2');
        MyString.concat(str3, 'b');
        MyString.concat(str3, '5');

        MyString test2 = MyString.parseInt(str3);
        MyString.print(test2);

    }


}
