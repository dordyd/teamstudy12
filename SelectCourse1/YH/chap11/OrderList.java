package chap11;

public class OrderList {
    int num;
    OrderList next;

    public OrderList() {
    }

    public static int length(OrderList lis) {
        int count = 0;
        while (lis != null) {
            count++;
            lis = lis.next;
        }
        return count;
    }


    public static boolean isOrder(OrderList lis) {
        while (lis != null) {
            if (lis.num > lis.next.num) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInOrder(OrderList lis, int num) {
        while (lis != null) {
            if (lis.num == num) {
                return true;
            }
        }
        return false;
    }

    public static OrderList insertNum(OrderList lis, int num) {
        OrderList p = new OrderList();
        OrderList gen = new OrderList();
        gen.next = lis;
        lis = gen;
        p.num = num;

        while (gen.next != null) {
            if (num <= gen.next.num) {
                p.next = gen.next;
                gen.next = p;

                return lis.next;
            }
            gen = gen.next;
        }
        if (gen.next == null) {
            gen.next = p;
            p.next = null;
        }
        return lis.next;
    }

    public static OrderList deleteNum(OrderList lis, int num) {
        OrderList gen = new OrderList();
        gen.next = lis;
        lis = gen;

        while (gen.next != null) {
            if (gen.next.num == num) {
                gen.next = gen.next.next;
                return lis.next;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static OrderList newListMerge(OrderList lis1, OrderList lis2) {
        OrderList newList = new OrderList();
        while (lis2 != null) {
            OrderList.insertNum(newList, lis2.num);
            lis2 = lis2.next;
        }
        while (lis1 != null) {
            OrderList.insertNum(newList, lis1.num);
            lis1 = lis1.next;
        }
        return newList.next;
    }

    public static OrderList insertNum(OrderList lis, OrderList p) {

        OrderList gen = new OrderList();
        gen.next = lis;
        lis = gen;

        while (gen.next != null) {
            if (p.num <= gen.next.num) {
                p.next = gen.next;
                gen.next = p;

                return lis.next;
            }
            gen = gen.next;
        }
        if (gen.next == null) {
            gen.next = p;
            p.next = null;
        }
        return lis.next;
    }
    public static OrderList listMergeReuse(OrderList lis1, OrderList lis2) {
        OrderList newLis = new OrderList();
        OrderList temp = new OrderList();
        while (lis1 != null || lis2 != null) {
            if(lis1 == null || lis2 == null) {
                if (lis1 == null) {
                    temp = lis2.next;
                    OrderList.insertNum(newLis, lis2);
                    lis2 = temp;
                } else if (lis2 == null) {
                    temp = lis1.next;
                    OrderList.insertNum(newLis, lis1);
                    lis1 = temp;
                }
            }
            else {
                if (lis1.num > lis2.num) {
                    temp = lis2.next;
                    OrderList.insertNum(newLis, lis2);
                    lis2 = temp;
                } else if (lis1.num < lis2.num) {
                    temp = lis1.next;
                    OrderList.insertNum(newLis, lis1);
                    lis1 = temp;
                }
            }
        }
        return newLis.next;
    }

    public static OrderList listMergeDeleteDouble(OrderList lis1, OrderList lis2) {
        OrderList newList = OrderList.newListMerge(lis1, lis2);
        OrderList gen = newList;
        while (gen.next != null) {
            if (gen.num == gen.next.num) {
                gen.next = gen.next.next;
            }
            gen = gen.next;
        }
        return newList;
    }

    public static void print(OrderList lis) {
        while (lis != null) {
            System.out.print(lis.num + " ");
            lis = lis.next;
        }
        System.out.println(

        );
    }

    public static void main(String[] args) {
        OrderList lis1 = new OrderList();
        lis1.num = 10;
        lis1 = OrderList.insertNum(lis1, 10);
        lis1 = OrderList.insertNum(lis1, 9);
        lis1 = OrderList.insertNum(lis1, 17);
        lis1 = OrderList.insertNum(lis1, 13);
        System.out.println(OrderList.length(lis1));
        OrderList.print(lis1);
        OrderList lis2 = new OrderList();
        lis2.num = 4;
        lis2 = OrderList.insertNum(lis2, 16);
        lis2 = OrderList.insertNum(lis2, 5);
        OrderList.print(lis2);

        OrderList newLis = newListMerge(lis1, lis2);
        OrderList.print(newLis);
        OrderList.print(lis1);
        OrderList.print(lis2);

        OrderList test = listMergeReuse(lis1, lis2);
        OrderList.print(test);
        System.out.println();
        OrderList.print(lis1);
        lis2.num = 10;
        OrderList.print(lis2);
//        OrderList newLis2;
//        newLis2 = listMergeDeleteDouble(lis1, lis2);
//        OrderList.print(newLis2);

    }
}
