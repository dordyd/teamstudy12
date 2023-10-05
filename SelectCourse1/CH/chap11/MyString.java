package SelectCourse1.CH.chap11;

class MyChar {
    char info;
    MyChar next;
}

public class MyString {
    MyChar mychar;

    public MyString(String input) {
        mychar = new MyChar();
        MyChar pointer = mychar;
        for (int i = 0; i < input.length(); i++) {
            MyChar tmp = new MyChar();
            tmp.info = input.charAt(i);
            mychar.next = tmp;
            mychar = mychar.next;
        }
        mychar = pointer.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyChar tmp = mychar;
        while (tmp != null) {
            sb.append(tmp.info);
            tmp = tmp.next;
        }
        return sb.toString();
    }

    public void concat(MyString input) {
        MyChar pointer = mychar;
        MyChar inputPointer = input.mychar;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        while (inputPointer != null) {
            pointer.next = inputPointer;
            pointer = pointer.next;
            inputPointer = inputPointer.next;
        }

    }

    public boolean equals(MyString that) {
        MyChar pointer = mychar;
        MyChar inputPointer = that.mychar;
        while (pointer != null && inputPointer != null) {
            if (pointer.info != inputPointer.info) {
                pointer = pointer;
                inputPointer = inputPointer;
                return false;
            }
            pointer = pointer.next;
            inputPointer = inputPointer.next;
        }
        if (pointer != null && that.mychar != null) {
            return false;
        }

        return true;
    }

    public MyString subString(int start, int end) {
        MyChar pointer = mychar;
        for (int i = 0; i < start; i++) {
            pointer = pointer.next;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(pointer.info);
            pointer = pointer.next;
        }
        return new MyString(sb.toString());
    }

    public char indexOf(int index) {
        MyChar pointer = mychar;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer.info;
    }

    public int charAt(char input) {
        MyChar pointer = mychar;
        int count = 0;
        while (pointer != null) {
            if (pointer.info == input) {
                return count;
            }
            count++;
            pointer = pointer.next;
        }
        return -1;
    }

    public void toUpperCase() {
        MyChar pointer = mychar;
        while (pointer != null) {
            if (pointer.info <= 'z' && pointer.info > 'a') {
                pointer.info -= 32;
            }
            pointer = pointer.next;
        }
    }

    public static int parseInt(MyString input) {
        int ans = 0;
        MyChar pointer = input.mychar;
        while (pointer != null) {
            if (pointer.info <= '9' && pointer.info >= '0') {
                ans *= 10;
                ans += (pointer.info - '0');
            } else {
                throw new IllegalArgumentException(pointer.info + " is not int");
            }
            pointer = pointer.next;
        }
        return ans;
    }

    public static int parseIntRecursion(MyString input) {
        if (input.mychar.next == null) {
            return input.mychar.info - '0';
        } else if (input.mychar.info <= '9' && input.mychar.info >= '0') {
            int tmp = input.mychar.info - '0';
            input.mychar = input.mychar.next;
            return parseIntRecursion(input) * 10 + tmp;
        } else {
            throw new IllegalArgumentException(input.mychar.info + " is not int");
        }
    }

    public static int parseIntRecursiontest(MyChar input, int ans) {
        if (input == null) {
            return ans;
        } else if (input.info <= '9' && input.info >= '0') {
            int tmp = input.info - '0';

            return parseIntRecursiontest(input.next, ans * 10 + tmp);
        } else {
            throw new IllegalArgumentException(input.info + " is not int");
        }
    }

    public static void main(String[] args) {
        MyString my = new MyString("test");
        MyString you = new MyString("123123");
        // System.out.println(my);
        // my.concat(you);
        // System.out.println(my);
        // System.out.println(you.equals(my));
        // MyString subs = my.subString(2, 4);
        // System.out.println(subs);
        // System.out.println(my.charAt('s'));
        // my.toUpperCase();
        // System.out.println(my);
        // int i = parseInt(you);
        // System.out.println(i);
        // int h = parseIntRecursion(you);
        // System.out.println(h);

        int a = parseIntRecursiontest(you.mychar, 0);
        System.out.println(a);
    }
}
