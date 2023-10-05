package SelectCourse1.CH.chap11;

class CD {
    String author;
    String title;
    int year;
    int price;

    CD(String author, String title, int year, int price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    boolean equals(CD that) {
        return this.author.equals(that.author) && this.title.equals(that.title) && this.year == that.year
                && this.price == that.price;
    }

    public String string() {
        return author + " " + title + " " + year + " " + price;
    }
}

class CDList {
    CD info;
    CDList next;
}

public class ListCDs {
    public static CDList insert(CDList lis, CD CD) {
        CDList gen = new CDList();
        gen.info = CD;
        gen.next = lis;
        return gen;
    }

    public static CDList delete(CDList lis, CD CD) {
        CDList gen = new CDList();
        gen.next = lis;
        lis = gen;
        boolean found = false;
        while (!found && gen.next != null) {
            if (gen.next.info.equals(CD)) {
                gen.next = gen.next.next;
                found = true;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static void printAll(CDList lis) {
        while (lis != null) {
            System.out.println(lis.info.string());
            lis = lis.next;
        }
    }

    public static double totalPrice(CDList lis) {
        double totalPrice = 0;
        while (lis != null) {
            totalPrice += lis.info.price;
            lis = lis.next;
        }
        return totalPrice;
    }

    public static CDList findCdListByAuthor(CDList lis, String author) {
        CDList cdList = new CDList();
        CDList returnList = cdList;
        while (lis != null) {
            if (lis.info.author.equals(author)) {
                CDList tmp = new CDList();
                tmp.info = lis.info;
                cdList.next = tmp;
                cdList = cdList.next;
            }
            lis = lis.next;
        }
        return returnList.next;
    }

    public static void main(String[] args) {
        CDList a = new CDList();
        a.info = new CD("author", "test", 1999, 2000);
        CDList b = new CDList();
        b.info = new CD("author", "Test2", 2011, 2000);
        CDList c = new CDList();
        c.info = new CD("test", "test3", 2022, 2000);
        a.next = b;
        b.next = c;
        c.next = null;
        printAll(a);
        CDList d = insert(a, new CD("insert", "4", 1111, 2000));
        printAll(d);
        delete(d, new CD("test", "test3", 2022, 2000));
        printAll(d);
        System.out.println(totalPrice(d) + "원이다");
        CDList e = findCdListByAuthor(d, "author");
        System.out.println("mmmmm");
        printAll(e);
    }
}
