package chap11;

import java.io.PrintStream;

public class ListNode {
    public String info;
    public ListNode next;

    public ListNode(String s) {
        this.info = s;
    }

    public ListNode() {
    }

    public static ListNode insertFirst(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;
        p.next = lis;
        lis = p;
        return lis;
    }

    public static ListNode deleteFirst(ListNode lis) {
        if (lis != null) {
            lis = lis.next;
        }
        return lis;
    }

    public static void print(ListNode lis, PrintStream ps) {
        while (lis != null) {
            ps.append(lis.info + " ");
            lis = lis.next;
        }
        ps.println();
    }

    public static boolean search(ListNode lis, String s) {
        while (lis != null) {
            if (lis.info.equals(s)) {
                return true;
            }
            lis = lis.next;
        }
        return false;
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

        return lis.next;
    }

    public static int length(ListNode lis) {
        int count = 0;
        while (lis != null) {
            count++;
            lis = lis.next;
        }
        return count;
    }

    public static ListNode InsertAfter(ListNode lis, String s, String given) {
        ListNode p = new ListNode();
        p.info = s;
        while (lis != null) {
            if (lis.info.equals(given)) {
                p.next = lis.next;
                lis.next = lis.next.next;
                return lis;
            }
            lis = lis.next;
        }
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
                break;
            }
        }

        return lis;
    }

    public static ListNode ModifyAll(ListNode lis, String old, String ne) {
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
            }
        }

        return lis;
    }

    public static ListNode insertBefor(ListNode lis, String s, String given) {
        ListNode gen = new ListNode();
        gen.next = lis;
        lis = gen;

        ListNode p = new ListNode();
        p.info = s;

        while (gen.next != null) {
            if (gen.next.info.equals(given)) {
               p.next = gen.next;
               gen.next = p;
            }
            gen = gen.next;
        }
        return lis;
    }

    public static ListNode copy(ListNode lis) {
        ListNode newLis = lis;
        return newLis;
    }

    public static ListNode invert(ListNode lis) {
        ListNode newNode = new ListNode();
        newNode.info = lis.info;
        lis = lis.next;
        while (lis != null) {
            newNode = ListNode.insertFirst(newNode, lis.info);
            lis = lis.next;
        }
        return newNode;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        ListNode p = lis;
        while (p != null) {
            while (lis.next != null) {
                if (p.info.equals(lis.next.info)) {
                    lis = ListNode.delete(lis, p.info);
                    continue;
                }
                lis = lis.next;
            }
            p = p.next;
        }
        return lis;
    }

    

    public static void main(String[] args) {
        ListNode lis = new ListNode();
        lis.info = "aaa";
        lis = ListNode.insertLast(lis, "aa");
        lis = ListNode.insertLast(lis, "aa");
        lis = ListNode.insertLast(lis, "aa");
        lis = ListNode.insertLast(lis, "aa");
        lis = ListNode.insertFirst(lis, "aa");
        ListNode.print(lis, System.out);

        ListNode copyLis = ListNode.copy(lis);
        ListNode.print(copyLis, System.out);

        lis = ListNode.invert(lis);

        ListNode.print(lis, System.out);
        lis = ListNode.deleteDoubles(lis);

        ListNode.print(lis, System.out);

        lis = ListNode.insertBefor(lis, "bbb", "aaa");
        ListNode.print(lis, System.out);
    }
}


// public static boolean search(ListNode lis, String s){
//     if(lis == null){
//         return false;
//     }

//     if(lis.info.equals(s)){
//         return true;
//     }
//     else{
//         return search(lis.next, s);
//     }
// }
