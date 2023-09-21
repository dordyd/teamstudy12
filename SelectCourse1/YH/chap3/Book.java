package chap3;

import java.util.Scanner;

public class Book {
    private String title;
    private String authors;
    private int price;

    public Book(String title, String Authors) {
        this.title = title;
        this.authors = Authors;
    }

    public void printBook() {
        System.out.println("title = " + this.getTitle() + "\nAuthors = " + this.getAuthors());
    }

    public void printBookPrice() {
        System.out.println(
                "title = " + this.getTitle() + "\nAuthors = " + this.getAuthors() + "\nPrice = " + this.getPrice());
    }

    public static Book keyboardInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter book title:");
        String title = scanner.nextLine();
        System.out.print("enter book authros: ");
        String authors = scanner.nextLine();
        return new Book(title, authors);
    }

    public void windowBook() {
        System.out.println("title = " + this.getTitle() + "\nAuthors = " + this.getAuthors());
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthors() {
        return this.authors;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "title = " + title + " authors = " + authors;
    }
}

