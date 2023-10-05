package SelectCourse1.CH.chap11;

// class ListNode {
//     public String info;
//     public ListNode next;
// }

public class prac11_01 {
    public static int length(ListNode lis) {
        int count = 1;
        while (lis.next != null) {
            count++;
            lis = lis.next;
        }
        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode gen = new ListNode();
        gen.next = lis;
        lis = gen;
        ListNode p = new ListNode();
        p.info = s;
        while (gen.next != null) {
            if (gen.next.info.equals(given)) {
                p.next = gen.next.next;
                gen.next.next = p;
                return lis.next;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode gen = new ListNode();
        gen.next = lis;
        lis = gen;
        while (gen.next != null) {
            if (gen.next.info.equals(old)) {
                gen.next.info = ne;
                return lis.next;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode gen = new ListNode();
        gen.next = lis;
        lis = gen;
        while (gen.next != null) {
            if (gen.next.info.equals(old)) {
                gen.next.info = ne;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode gen = new ListNode();
        gen.next = lis;
        lis = gen;
        ListNode p = new ListNode();
        p.info = s;
        while (gen.next != null) {
            if (gen.next.info.equals(given)) {
                p.next = gen.next;
                gen.next = p;
                return lis.next;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static ListNode copy(ListNode lis) {
        ListNode copy = new ListNode();
        ListNode copyHead = copy;

        while (lis != null) {
            ListNode copyTmp = new ListNode();
            copyTmp.info = lis.info;
            copy.next = copyTmp;
            copy = copy.next;
            lis = lis.next;
        }
        return copyHead.next;
    }

    public static ListNode invert(ListNode lis) {
        ListNode prev = null;
        ListNode current = lis;
        ListNode nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        lis.next = null;
        return lis;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        int count = 0;
        int lis2Len = length(lis2);
        ListNode lis2tmp = lis2;
        while (lis1 != null) {
            if (lis1.info.equals(lis2.info)) {
                count++;
                lis2 = lis2.next;
            } else {
                count = 0;
                lis2 = lis2tmp;
            }
            if (count == lis2Len) {
                return true;
            }
            lis1 = lis1.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        a.info = "A";
        a.next = b;
        // b.info = "B";
        // b.next = c;
        // c.info = "C";
        // c.next = d;
        // d.info = "B";
        // d.next = null;

        // System.out.println(length(a));
        // insertAfter(a, "D", "C");
        // System.out.println(length(a));
        // modify(a, "A", "BB");
        // modifyAll(a, "B", "CC");
        // insertBefore(a, "beforeC", "C");
        // ListNode copyA = copy(a);
        // invert(a);
        // deleteDoubles(a);
        // System.out.println(searchSequence(a, b));
    }
}
