package SelectCourse1.CH.chap11;

class ListNode {
    public String info;
    public ListNode next;
}

public class prac11_02 {
    public static int length(ListNode lis, int count) {
        count++;
        if (lis.next == null) {
            return count;
        } else {
            return length(lis.next, count);
        }
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        if (lis == null) {
            return lis;
        } else if (lis.info.equals(given)) {
            ListNode res = new ListNode();
            res.info = s;
            res.next = lis.next;
            lis.next = res;
            return res;
        } else {
            return insertAfter(lis.next, s, given);
        }
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        if (lis == null) {
            return lis;
        } else if (lis.info.equals(old)) {
            lis.info = ne;
            return lis;
        } else {
            return modify(lis.next, old, ne);
        }

    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        if (lis == null) {
            return lis;
        } else if (lis.info.equals(old)) {
            lis.info = ne;
            return modifyAll(lis.next, old, ne);
        } else {
            return modifyAll(lis.next, old, ne);
        }
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        if (lis.next == null) {
            return lis;
        } else if (lis.next.info.equals(given)) {
            ListNode tmp = new ListNode();
            tmp.info = s;
            tmp.next = lis.next;
            lis.next = tmp;
            return lis;
        } else {
            return insertBefore(lis.next, s, given);
        }
    }

    public static ListNode copy(ListNode lis) {
        if (lis == null) {
            return lis;
        }

        ListNode copy = new ListNode();
        copy.info = lis.info;
        copy.next = copy(lis.next);
        return copy;
    }

    public static ListNode invert(ListNode lis) {
        if (lis == null || lis.next == null) {
            return lis;
        }
        ListNode tmp = invert(lis.next);
        lis.next.next = lis;
        lis.next = null;
        return tmp;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        lis.next = null;
        return lis;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        if (lis2 == null) {
            return true;
        }
        if (lis1 == null) {
            return false;
        }
        if (lis1.info.equals(lis2.info)) {
            return searchSequence(lis1.next, lis2.next);
        }

        return searchSequence(lis1.next, lis2);

    }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "C";
        c.next = d;
        d.info = "B";
        d.next = null;
        // System.out.println(length(a, 0));
        // insertAfter(a, "D", "C");
        // System.out.println(length(a));
        // modify(a, "A", "BB");
        // modifyAll(a, "B", "CC");
        // insertBefore(a, "beforeC", "C");
        // ListNode copyA = copy(a);
        // invert(a);
        // deleteDoubles(a);
        System.out.println(searchSequence(a, b));
    }
}
