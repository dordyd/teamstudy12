package Unit3_Excercises;

import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printBook() {
        System.out.println(this);
    }

    public void printBookPrice() {
        printBook();
        System.out.println("Price : " + getPrice() + "원");
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthors() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Book inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert Book Title : ");
        String title = sc.nextLine();
        System.out.printf("Insert Book Author : ");
        String author = sc.nextLine();

        return new Book(title, author);
    }

    @Override
    public String toString() {
        return "Title : " + this.title + "\nAuthor  : " + this.author;
    }
}
