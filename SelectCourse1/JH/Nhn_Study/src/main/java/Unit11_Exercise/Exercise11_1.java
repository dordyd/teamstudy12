package Unit11_Exercise;

import java.io.PrintStream;

public class Exercise11_1 {

    public static ListNode create3NodesABC() {
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

        return a;
//
//        a.info = "A";
//        a.next = null;
//        return a;
    }

    public static void print(ListNode lis, PrintStream ps) {
        ListNode p = lis;
        while (p != null) {
            ps.print(p.info + " ");
            p = p.next;
        }
        ps.println();
    }

    public static int length(ListNode lis) {
        int count = 0;

        while (lis != null) {
            count++;
            lis = lis.next;
        }
        return count;
    }

    private static ListNode insertAfter(ListNode lis, String s, String given) {

        ListNode current = lis;

        while (current != null) {
            if (current.info.equals(given)) {
                ListNode p = new ListNode();
                p.info = s;

                p.next = current.next;
                current.next = p;
                current = p;
            } else {
                current = current.next;
            }
        }
        return lis;
    }


    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = new ListNode();
        p.info = ne;

        ListNode current = lis;

        while (current != null) {
            if (current.info.equals(old)) {
                current.info = ne;
                break;
            }
            current = current.next;

        }
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {

        ListNode current = lis;
        while (current != null) {
            ListNode p = new ListNode();
            p.info = ne;

            if (current.info.equals(old)) {
                current.info = ne;
            } else {
                current = current.next;
            }
        }
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode gen = new ListNode();
        gen.next = lis;
        lis = gen;

        while (gen.next != null) {
            if (gen.next.info.equals(given)) {
                ListNode p = new ListNode();
                p.info = s;

                p.next = gen.next;
                gen.next = p;
                gen = p.next;
            } else {
                gen = gen.next;
            }

        }

        return lis.next;
    }

    public static ListNode copy(ListNode lis) {
        ListNode original = lis;
        ListNode copiedList = new ListNode();
        ListNode copiedCurrent = copiedList;

        while (original != null) {
            ListNode newNode = new ListNode();
            newNode.info = original.info;

            copiedCurrent.next = newNode;
            copiedCurrent = copiedCurrent.next;

            original = original.next;
        }

        return copiedList.next;
    }

    public static ListNode invert(ListNode lis) {
        ListNode invertList = null;

        while (lis != null) {
            ListNode current = lis;
            lis = lis.next;
            current.next = invertList;
            invertList = current;
        }
        return invertList;
    }

    public static ListNode deleteDouble(ListNode lis) {
        ListNode head = lis;
        ListNode current = lis;

        while (current != null) {
            ListNode runner = current;
            while (runner.next != null) {
                if (current.info.equals(runner.next.info)) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return head;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        ListNode current1 = lis1;
        ListNode current2 = lis2;

        while (current1 != null && current2 != null) {
            if (current1.info.equals(current2.info)) {
                current1 = current1.next;
                current2 = current2.next;
            } else {
                current1 = lis1.next;
                current2 = lis2;
            }
        }

        return current2 == null;
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

    public static void main(String[] args) {
        PrintStream ps = System.out;
        ListNode test = create3NodesABC();

        System.out.println(length(test));

        print(test, ps);
        System.out.println("==========================");

        insertAfter(test, "C", "A");
        print(test, ps);
        System.out.println("==========================");


        modify(test, "B", "Y");
        print(test, ps);
        System.out.println("==========================");


        modifyAll(test, "C", "P");
        print(test, ps);
        System.out.println("==========================");


        insertBefore(test, "S", "P");
        print(test, ps);
        System.out.println("==========================");


        ListNode copyTest = copy(test);
        System.out.println(test);
        print(test, ps);
        System.out.println(copyTest);
        print(copyTest, ps);
        System.out.println("==========================");


        test = deleteAll(test, "A");
        print(test, ps);

        copyTest = deleteAll(copyTest, "A");
        print(copyTest, ps);
        System.out.println("==========================");

        test = invert(test);
        print(test, ps);
        System.out.println("==========================");

        insertAfter(test, "S", "P");
        print(test, ps);

        deleteDouble(test);
        print(test, ps);
        System.out.println("==========================");

        test = deleteAll(test, "B");
        test = deleteAll(test, "P");
        deleteAll(copyTest, "P");
        insertAfter(test, "S", "Y");
        System.out.printf("Original : ");
        print(test, ps);
        System.out.printf("Copy : ");
        print(copyTest, ps);

        System.out.println(searchSequence(copyTest, test));

    }


}
