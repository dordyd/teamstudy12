//The name of the outer type and the file do not match.Checkstyle(OuterTypeFilenameCheck)
public class Ex001 {
    public static int length(ListNode lis) {
        int count = 1;

        while (lis.next != null) {
            lis = lis.next;
            count++;
        }
        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String been) {
        ListNode p = new ListNode();
        p.info = s;

        if (lis == null)
            return null;

        ListNode after = lis;
        while (after.next != null) {
            after = after.next;
            if (after.info.equals(been))
                after.next = p;
           
            // ListNode last = lis;
            // while (last.next != null)
            // last = last.next;
            // last.next = p;
            // return lis;
        }
         return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        boolean found = false;
        while (p.next != null && !found) {
            if (p.next.info.equals(old)) {
                p.next.info = ne;
                found = true;
            }
            p = p.next;
        }
        return lis.next;
        // boolean 쓰지 말고 break;로 빠져나오면
    }

    public static ListNode ListNodemodifyAll(ListNode lis, String old, String ne) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        while (p.next != null) {
            if (p.next.info.equals(old)) {
                p.next.info = ne;
            }
            p = p.next;
        }
        return lis.next;
    }

    public static ListNode insertBefore(ListNode lis, String s, String been) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;
        p.info = s;

        if (lis == null)
            return null;

        while (p.next != null) {
            p = p.next;
            if (p.info.equals(been)) {
                p.next = lis;
                lis = p;
            }
        }
        return lis;
        // ListNode p = new ListNode();
        // p.info = s;
        // p.next = lis;
        // lis = p;
        // return lis;
    }

    public static ListNode copy(ListNode lis) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        while (p.next != null) {
            ListNode copy = new ListNode();
            copy.info = lis.info;
        } // copy.next
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
        if (lis != null)
            lis = lis.next;
        return lis;
    }
    // 수정

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        a.info = "A";
        a.next = b;
       // System.out.println(insertBefore(a,'E','A'));

        System.out.println(length(a));
        System.out.println(modify(a, "L", "A"));
        deleteDoubles(a);
        System.out.println(a.info);
    }
}