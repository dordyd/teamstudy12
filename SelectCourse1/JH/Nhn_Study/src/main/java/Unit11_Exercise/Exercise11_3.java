package Unit11_Exercise;

import java.io.PrintStream;

public class Exercise11_3 {

    public static boolean isSortListNode(ListNode lis) {

        ListNode sortedList = null;
        ListNode current = lis;

        while (current != null) {
            int value = Integer.parseInt(current.info);
            ListNode newNode = new ListNode();
            newNode.info = Integer.toString(value);

            
            if (sortedList == null || value <= Integer.parseInt(sortedList.info)) {
                newNode.next = sortedList;
                sortedList = newNode;
            } else {
                ListNode prev = null;
                ListNode temp = sortedList;

                while (temp != null && value > Integer.parseInt(temp.info)) {
                    prev = temp;
                    temp = temp.next;
                }

                prev.next = newNode;
                newNode.next = temp;
            }

            current = current.next;
        }

        while (current != null) {
            if (current.info.equals(sortedList.info)) {
                current = current.next;
                sortedList = sortedList.next;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void print(ListNode lis, PrintStream ps) {
        ListNode p = lis;
        while (p != null) {
            ps.print(p.info + " ");
            p = p.next;
        }
        ps.println();
    }

    public static ListNode createListNode() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        ListNode e = new ListNode();

        a.info = String.valueOf(1);
        a.next = b;
        b.info = String.valueOf(2);
        b.next = c;
        c.info = String.valueOf(3);
        c.next = d;
        d.info = String.valueOf(4);
        d.next = e;
        e.info = String.valueOf(1);
        e.next = null;

        return a;
    }

    public static void main(String[] args) {

    }
}
