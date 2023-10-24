
public class Ex02 {
    public static int length(ListNode lis, int count) {
        count++;
        if (lis.next == null) {
            return count;
        } else {
            return length(lis.next, count);
        }
    }

    public static ListNode insertAfter(ListNode lis, String s, String been) {
        ListNode p = new ListNode();
        if (lis == null) {
            p.info = s;
            return p;
        } else {
            lis.next = insertAfter(lis.next, s, p.info);
            return lis;
        }
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        // lis.info=ne;
        // return lis;
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        boolean found = false;
        while (p.next != null && !found) {
            if (p.next.info.equals(old)) {
                p.info = ne;
                found = true;
            } else
                p = p.next;
        }
        return lis.next;

    }

    public static ListNode ListNodemodifyAll(ListNode lis, String old, String ne) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        while (p.next != null) {
            if (p.next.info.equals(old)) {
                p.info = ne;
            } else
                p = p.next;
        }
        return lis.next;
    }

    public static ListNode insertBefore(ListNode lis, String s, String been) {
        if (lis.next == null)
            return lis;
        else if (lis.next.info.equals(s)) {
            ListNode p = new ListNode();
            p.info = s;
            p.next = lis;
            lis.next = p;
            return lis;
        } else
            return insertBefore(lis.next, s, been);

    }

    public static ListNode copy(ListNode lis) {
        if (lis == null)
            return lis;
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;
        p.info = lis.info;
        p.next = copy(lis.next);

        return p;

    }
    // public static ListNode invert(ListNode lis){
    // ListNode p = new ListNode();
    // p.next = lis;
    // lis = p;
    // while(p.next!=null){

    // }
    // }
    public static ListNode deleteDoubles(ListNode lis) {
        if (lis == null)
            return null;
        else {
            lis.next = deleteDoubles(lis.next);
            return lis;
        }
    }
    // public static boolean searchSequence(ListNode lis1, ListNode lis2){
    // while(list1!=null&&list2!=null){

    // }
    // }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "a";
        a.next = b;
        b.info = "b";

        // insertBefore(c, 'D', 'b');

        System.out.println(length(a, 0));
        insertAfter(a, "D", "a");
    }
}