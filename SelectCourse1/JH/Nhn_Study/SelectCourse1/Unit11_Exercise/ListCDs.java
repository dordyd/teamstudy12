package Unit11_Exercise;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ListCDs {

    private ArrayList<CD> cdList;

    public ListCDs() {
        this.cdList = new ArrayList<>();
    }

    protected void insertCD(String author, String title, int year, int price) {
        CD cd = new CD(author, title, year, price);
        cdList.add(cd);
    }

    public void deleteCd(String title) {
        Iterator<CD> iterator = cdList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getTitle().equals(title)) {
                iterator.remove();
            }
        }
    }

    public int totalPrice() {
        Iterator<CD> iterator = cdList.iterator();

        int totalPrice = 0;
        while (iterator.hasNext()) {
            totalPrice += iterator.next().getPrice();
        }
        return totalPrice;
    }

    public void infoByAuthor(String author) {
        PrintStream ps = System.out;
        infoByAuthorHelper(author, ps);
    }

    public void infoByAuthorHelper(String author, PrintStream ps) {
        Iterator<CD> iterator = cdList.iterator();

        while (iterator.hasNext()) {
            CD cd = iterator.next();
            if (cd.getAuthor().equals(author)) {
                ps.print(cd);
            }
        }
    }


    public void print(PrintStream ps) {
        Iterator<CD> iterator = cdList.iterator();

        while (iterator.hasNext()) {
            ps.print(iterator.next().toString());
        }
    }


}

class CD {
    private String author;
    private String title;
    private int year;
    private int price;

    public CD(String autor, String title, int year, int price) {
        this.author = autor;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return this.author + " " + this.title + " " + this.year + " " + this.price + "\n";
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        PrintStream ps = System.out;

        ListCDs listCDs = new ListCDs();

        listCDs.insertCD("정훈", "A", 1999, 10000);
        listCDs.insertCD("윤호", "B", 1999, 10000);
        listCDs.insertCD("재준", "C", 1997, 20000);
        listCDs.insertCD("현명", "D", 1996, 30000);

        listCDs.print(ps);
        System.out.println("=============================");

        listCDs.deleteCd("C");
        listCDs.print(ps);
        System.out.println("=============================");

        int totalPrice = listCDs.totalPrice();
        System.out.println(totalPrice);
        System.out.println("=============================");

        listCDs.insertCD("정훈", "Z", 1999, 50000);
        listCDs.infoByAuthor("정훈");

    }
}
