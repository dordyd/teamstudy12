package Unit11_Exercise;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class MyString {

    private ArrayList<Character> arrayList;

    protected MyString(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public void concat(String str) {
        char[] strtoCharArray = str.toCharArray();
        for (int i = 0; i < strtoCharArray.length; i++) {
            arrayList.add(strtoCharArray[i]);
        }
    }

    public boolean equal(char ch) {
        Iterator<Character> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(ch)) {
                return true;
            }
        }
        return false;
    }

    public String substring(int start, int end) {
        String output = "";
        for (int i = start; i < end; i++) {
            output += arrayList.get(i);
        }
        return output;
    }

    public String substring(int start) {
        String output = "";
        for (int i = start; i < arrayList.size(); i++) {
            output += arrayList.get(i);
        }
        return output;
    }

    public int length() {
        return arrayList.size();
    }

    public char charAt(int index) {
        return arrayList.get(index);
    }

//    public int indexOf(String str) {
//        int[] indexArray = new int[str.length()];
//        char[] strToCharArray = str.toCharArray();
//
//    }

    public void print(PrintStream ps) {
        Iterator<Character> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            ps.print(iterator.next().toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrintStream ps = System.out;

        String inputString = "AbCdEf";
        char[] inputStringToCharArray = inputString.toCharArray();
        ArrayList arrayList = new ArrayList();
        for (char ch : inputStringToCharArray) {
            arrayList.add(ch);
        }

        MyString myString = new MyString(arrayList);
        myString.print(ps);

        myString.concat("GhI");
        myString.print(ps);

        boolean hasA = myString.equal('b');
        System.out.println(hasA);

        String substring2Parameter = myString.substring(1, 5);
        System.out.println(substring2Parameter);

        String substring1Parameter = myString.substring(3);
        System.out.println(substring1Parameter);

        int length = myString.length();
        System.out.println(length);

        char charAt = myString.charAt(0);
        System.out.println(charAt);

    }

}


