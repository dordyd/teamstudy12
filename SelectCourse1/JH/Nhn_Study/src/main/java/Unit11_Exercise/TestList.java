package Unit11_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class TestList {

    public static ListNode create3NodesABC() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();

        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "C";
        c.next = null;

        return a;
    }

    public static ListNode insertFirst(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;
        p.next = lis;
        lis = p;
        return lis;
    }

    public static ListNode deleteFrist(ListNode lis) {
        if (lis != null) {
            lis = lis.next;
        }
        return lis;
    }

    public static void print(ListNode lis, PrintStream ps) {
        ListNode p = lis;
        while (p != null) {
            ps.print(p.info + " ");
            p = p.next;
        }
        ps.println();
    }

    public static ListNode insertLast(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;

        if (lis == null) {
            return p;
        } else {
            ListNode last = lis;
            while (last.next != null) {
                last = last.next;
            }
            last.next = p;
            return lis;
        }
    }

    public static ListNode read(BufferedReader br) throws IOException {
        ListNode lis = new ListNode();
        ListNode p = lis;

        String s = br.readLine();
        while (s != null) {
            p.next = new ListNode();
            p = p.next;
            p.info = s;
            s = br.readLine();
        }
        lis = lis.next;
        br.close();
        return lis;

    }

    public static ListNode delete(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        boolean found = false;

        while ((p.next != null) && !found) {
            if (p.next.info.equals(s)) {
                p.next = p.next.next;
                found = true;
            } else {
                p = p.next;
            }
        }
        return lis.next;
    }

    public static ListNode deleteAll(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        while (p.next != null) {
            if (p.next.info.equals(s)) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return lis;
    }

    public static void main(String[] args) throws IOException {

        ListNode test = create3NodesABC();

        PrintStream ps = System.out;
        print(test, ps);

        test = insertFirst(test, "Z");
        print(test, ps);

        test = deleteFrist(test);
        print(test, ps);

        test = deleteFrist(test);
        print(test, ps);

        test = insertLast(test, "Z");
        print(test, ps);

        test = delete(test, "C");
        print(test, ps);

        test = insertFirst(test, "A");
        test = insertLast(test, "B");
        test = deleteAll(test, "B");
        print(test, ps);

        BufferedReader br = new BufferedReader(new FileReader(
                "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/java/Unit11_Exercise/test.txt"));
        ListNode fileReadTest = read(br);
        print(fileReadTest, ps);
        br.close();
    }

}
