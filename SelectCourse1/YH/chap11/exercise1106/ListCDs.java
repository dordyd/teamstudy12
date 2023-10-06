package chap11.exercise1106;

public class ListCDs {

    CD cd;
    ListCDs next;

    public ListCDs() {
    }

    public static int length(ListCDs lis) {
        int count = 0;
        while (lis != null) {
            count++;
            lis = lis.next;
        }

        return count;
    }

    public static ListCDs firstInsert(ListCDs lis, CD cd) {
        lis.cd = cd;
        return lis;
    }

    public static ListCDs insertCDs(ListCDs lis, CD cd) {
        if (ListCDs.length(lis) == 1 && lis.cd == null) {
            firstInsert(lis, cd);
            return lis;
        }
        ListCDs p = new ListCDs();
        ListCDs gen = lis;
        p.cd = cd;

        while (gen.next != null) {
            gen = gen.next;
        }
        gen.next = p;
        return lis;
    }

    public static ListCDs deleteCDs(ListCDs lis, CD cd) {
        ListCDs gen = new ListCDs();
        gen.next = lis;
        lis = gen;

        while (gen.next != null) {
            if (gen.next.cd.equals(cd)) {
                gen.next = gen.next.next;
                return lis.next;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static ListCDs copy(ListCDs lis) {
        ListCDs copy = new ListCDs();
        while (lis != null) {
            ListCDs.insertCDs(copy, lis.cd);
            lis = lis.next;
        }
        return copy;
    }

    public static long totalPrice(ListCDs lis) {
        long totalPrice = 0l;
        while (lis != null) {
            totalPrice = totalPrice + lis.cd.getPrice();
            lis = lis.next;
        }
        return totalPrice;
    }

    public static ListCDs searchAuthor(ListCDs lis, String author) {
        ListCDs findCD = new ListCDs();

        while (lis != null) {
            if (lis.cd.getAuthor().equals(author)) {
                ListCDs.insertCDs(findCD, lis.cd);
            }
            lis = lis.next;
        }

        return findCD;
    }

    public static void print(ListCDs lis) {
        while (lis != null) {
            System.out.print(lis);
            System.out.println();
            lis = lis.next;
        }
    }

    @Override
    public String toString() {
        return "cd: " + cd;
    }

    public static void main(String[] args) {
        ListCDs lis1 = new ListCDs();
        CD cd1 = new CD("뉴진스", "하입보이", "2022", 1000l);
        CD cd2 = new CD("황인욱", "포장마차", "2018", 2000l);
        CD cd3 = new CD("프로미스나인", "뭐있음?", "????", 2000l);
        CD cd4 = new CD("신용재", "첫줄", "2022", 1000l);
        CD cd5 = new CD("김윤호", "자바 좆같네", "2023", 1000000l);

        ListCDs.insertCDs(lis1, cd1);
        ListCDs.insertCDs(lis1, cd2);
        ListCDs.insertCDs(lis1, cd3);
        ListCDs.insertCDs(lis1, cd4);
        ListCDs.insertCDs(lis1, cd5);

        ListCDs.print(lis1);
        System.out.println();

        lis1 = ListCDs.deleteCDs(lis1, cd1);
        ListCDs.print(lis1);
        System.out.println();

        ListCDs copy;
        copy = ListCDs.copy(lis1);
        ListCDs.print(copy);
        System.out.println();

        System.out.println(totalPrice(lis1));
        System.out.println();

        CD cd6 = new CD("김윤호", "자바 개같네", "2023", 1000001l);
        ListCDs.insertCDs(lis1, cd6);
        ListCDs findCD = ListCDs.searchAuthor(lis1, "김윤호");
        ListCDs.print(findCD);

    }


}
