package Unit3_Excercise;

public class Book {

    private String title;
    private String author;
    private int price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printBook() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
    }

    public void printBookPrice() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
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

}
