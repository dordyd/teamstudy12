package SelectCourse1.CH.chap11;

import java.util.List;

class ListNode {
    public int info;
    public ListNode next;
}

public class prac11_03 {
    public static boolean isOrdered(ListNode lis) {

        while (lis.next != null) {
            int prev = lis.info;
            if (lis.next.info < prev) {
                return false;
            }
            lis = lis.next;
        }
        return true;
    }

    public static boolean isContain(ListNode lis, int given) {
        while (lis != null && lis.info < given) {
            if (lis.info == given) {
                System.out.println(given + "is contain");
                return true;
            }
            lis = lis.next;
        }
        return false;
    }
    // 2 3 5 6 7 8

    public static ListNode insert(ListNode lis, int given) {
        ListNode gen = new ListNode();
        gen.next = lis;
        lis = gen;

        ListNode insert = new ListNode();
        insert.info = given;
        if (gen.next.info > given) {
            insert.next = gen.next;
            gen.next = insert;
            return lis.next;
        }
        while (gen.next != null) {
            if (gen.info < given && gen.next.info > given) {
                insert.next = gen.next;
                gen.next = insert;
                return lis.next;
            }
            gen = gen.next;
        }
        gen.next = insert;
        return lis.next;
    }

    public static ListNode delete(ListNode lis, int given) {

        ListNode gen = new ListNode();
        ListNode prev = gen;
        gen.next = lis;
        lis = gen;

        while (gen != null) {
            if (gen.info == given) {
                prev.next = gen.next;
            }
            prev = gen;
            gen = gen.next;
        }
        return lis.next;
    }

    public static ListNode mergeNewNode(ListNode lis1, ListNode lis2) {
        ListNode mergeReturn = new ListNode();
        ListNode merge = new ListNode();
        mergeReturn = merge;
        boolean lis1NotNull = true;
        boolean lis2NotNull = true;
        while (lis1NotNull || lis2NotNull) {
            ListNode tmp = new ListNode();
            if (lis1NotNull && lis1.info <= lis2.info) {
                tmp.info = lis1.info;
                merge.next = tmp;
                merge = merge.next;
                if (lis1.next == null) {
                    lis1NotNull = false;
                    lis1 = lis2;
                } else {
                    lis1 = lis1.next;
                }

            } else if (lis2NotNull && lis2.info <= lis1.info) {
                tmp.info = lis2.info;
                merge.next = tmp;
                merge = merge.next;
                if (lis2.next == null) {
                    lis2NotNull = false;
                    lis2 = lis1;
                } else {
                    lis2 = lis2.next;

                }

            }
        }
        return mergeReturn.next;
    }

    public static ListNode mergeReuse(ListNode lis1, ListNode lis2) {
        ListNode mergeReturn = new ListNode();
        ListNode merge = mergeReturn;
        boolean lis1NotNull = true;
        boolean lis2NotNull = true;
        while (lis1NotNull || lis2NotNull) {

            if (lis1NotNull && lis1.info <= lis2.info) {
                merge.next = lis1;
                merge = merge.next;
                if (lis1.next == null) {
                    lis1NotNull = false;
                    lis1 = lis2;
                } else {
                    lis1 = lis1.next;
                }

            } else if (lis2NotNull && lis2.info <= lis1.info) {
                merge.next = lis2;
                merge = merge.next;
                if (lis2.next == null) {
                    lis2NotNull = false;
                    lis2 = lis1;
                } else {
                    lis2 = lis2.next;

                }

            }
        }
        return mergeReturn.next;
    }

    public static ListNode mergeIntersection(ListNode lis1, ListNode lis2) {
        ListNode mergeReturn = new ListNode();
        ListNode merge = mergeReturn;
        boolean lis1NotNull = true;
        boolean lis2NotNull = true;
        while (lis1 != null && lis2 != null) {
            if (lis1.info == lis2.info) {
                ListNode tmp = new ListNode();
                tmp.info = lis1.info;
                merge.next = tmp;
                merge = merge.next;
                lis1 = lis1.next;
                lis2 = lis2.next;
            } else if (lis1.info < lis2.info) {
                lis1 = lis1.next;
            } else if (lis2.info < lis1.info) {
                lis2 = lis2.next;
            }
        }
        return mergeReturn.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        a.info = 1;
        a.next = b;
        b.info = 2;
        b.next = c;
        c.info = 3;
        c.next = d;
        d.info = 6;
        d.next = null;
        // System.out.println(isContain(a, 5));
        // a = insert(a, -1);
        // delete(a, 2);
        ListNode e = new ListNode();
        ListNode f = new ListNode();
        e.info = 4;
        e.next = f;
        f.info = 7;
        f.next = null;
        // ListNode test = mergeNewNode(a, e);
        // System.out.println(isOrdered(test));
        ListNode test = mergeReuse(a, e);
        // System.out.println(isOrdered(test));
        // ListNode test = mergeIntersection(a, e);
        // System.out.println(isOrdered(test));
    }
}