package chap11;

import java.io.PrintStream;

public class ListNodeRecur {
    public String info;
    public ListNode next;

    public ListNodeRecur() {
    }

    public static ListNode insertFirst(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;
        p.next = lis;
        lis = p;
        return lis;
    }

    public static ListNode deleteFirst(ListNode lis) {
        return lis.next;
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
        return lengthsol(lis, 0);
    }

    public static int lengthsol(ListNode lis, int count) {
        if (lis == null) {
            return count;
        }
        count++;
        return lengthsol(lis.next, count);
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode p = new ListNode();
        p.info = s;
        ListNode ori = lis;
        return insertAfterSol(ori, lis, p, given);
    }

    public static ListNode insertAfterSol(ListNode ori, ListNode lis, ListNode p, String given) {
        if (lis != null && lis.info.equals(given)) {
            p.next = lis.next;
            lis.next = p;
            return ori;
        } else if (lis == null) {
            return ori;
        }
        return insertAfterSol(ori, lis.next, p, given);
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode ori;
        ori = lis;
        return modifySol(ori, lis, old, ne);
    }

    public static ListNode modifySol(ListNode ori, ListNode lis, String old, String ne) {
        if (lis == null) {
            return ori;
        }
        if (lis.info.equals(old)) {
            lis.info = ne;
            return ori;
        }
        return modifySol(ori, lis.next, old, ne);
    }


    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode ori = new ListNode();
        ori = lis;
        return modifyAllSol(ori, lis, old, ne);
    }


    public static ListNode modifyAllSol(ListNode ori, ListNode lis, String old, String ne) {
        if (lis == null) {
            return ori;
        }
        if (lis.info.equals(old)) {
            lis.info = ne;
        }
        return modifyAllSol(ori, lis.next, old, ne);
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode ori = new ListNode();
        ori.next = lis;

        ListNode p = new ListNode();
        p.info = s;
        return insertBeforeSolution(ori, lis, p, given);
    }

    private static ListNode insertBeforeSolution(ListNode ori, ListNode lis, ListNode p, String given) {
        if (lis.next == null) {
            return ori.next;
        }
        if (lis.next.info.equals(given)) {
            p.next = lis.next;
            lis.next = p;
            return ori.next;
        }

        return insertBeforeSolution(ori, lis.next, p, given);
    }


//    public static ListNode insertBefore(ListNode lis, String s, String given) {
//        ListNode gen = new ListNode();
//        gen.next = lis;
//        lis = gen;
//
//        ListNode p = new ListNode();
//        p.info = s;
//
//        while (gen.next != null) {
//            if (gen.next.info.equals(given)) {
//                p.next = gen.next;
//                gen.next = p;
//                return lis.next;
//            }
//            gen = gen.next;
//        }
//        return lis.next;
//    }

    public static ListNode copy(ListNode lis) {
        ListNode copy = new ListNode();

        return copySol(copy, lis);
    }

    public static ListNode copySol(ListNode copy, ListNode lis) {
        if(lis == null){
            return copy.next;
        }
        ListNode copyNode = new ListNode();
        copy = ListNode.insertLast(copy, lis.info);

        return copySol(copy, lis.next);
    }

    public static ListNode invert(ListNode lis) {
        ListNode invert = new ListNode();

        return invertSol(invert.next, lis);
    }

    public static ListNode invertSol(ListNode invert, ListNode lis) {
        if(lis == null){
            return invert;
        }
        ListNode inveryNode = new ListNode();
        invert = ListNode.insertFirst(invert, lis.info);


        return invertSol(invert, lis.next);
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

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        while (lis1 != null) {
            if (lis1.info.equals(lis2.info)) {
                ListNode copy2 = lis2;
                ListNode copy1 = lis1;
                int count = 0;
                while (copy2 != null && copy1.info.equals(copy2.info)) {
                    copy1 = copy1.next;
                    copy2 = copy2.next;
                    count++;
                    if (count == ListNode.length(lis2)) {
                        return true;
                    }
                }
            }
            lis1 = lis1.next;
        }
        return false;
    }

    public static void main(String[] args) {
        PrintStream ps = System.out;
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        a.info = "a";
        a.next = b;
        b.info = "b";
        b.next = c;
        c.info = "c";
        c.next = d;
        d.info = "c";
        d.next = null;


        ListNode a1 = new ListNode();
        ListNode b1 = new ListNode();

        a1.info = "a";
        a1.next = b1;
        b1.info = "b";
        b1.next = null;

//        System.out.println(ListNodeRecur.length(a));

//        a = ListNodeRecur.insertAfter(a, "d", "a");
//        ListNode.print(a, ps);

//        a = ListNodeRecur.modifyAll(a, "c", "d");
//        ListNode.print(a, ps);

//        a = ListNodeRecur.insertBefore(a, "b", "c");
//        ListNode.print(a, ps);
//
//        ListNode lis = ListNodeRecur.copy(a);
//        ListNode.print(lis, ps);
//        System.out.println(lis);
//        System.out.println(a);

//        ListNode lis = ListNodeRecur.invert(a);
//        ListNode.print(lis, ps);
//        System.out.println(lis);
//        System.out.println(a);

    }
}
