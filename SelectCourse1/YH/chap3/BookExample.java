package chap3;
import java.util.Scanner;

public class BookExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input firstBook title and authors");
        String firstTitle = scanner.next();

        String firstAuthors = scanner.next();
        Book firstBook = new Book(firstTitle, firstAuthors);
        System.out.println("Input SecondBook title and authors");
        String secondTitle = scanner.next();
        String secondAuthors = scanner.next();


        Book secondBook = new Book(secondTitle, secondAuthors);
        System.out.println("------firstBook------");
        firstBook.printBook();
        System.out.println("------secondBook------");
        secondBook.printBook();
        firstBook.setPrice(10000);
        System.out.println("------firstBookPrice------");
        firstBook.printBookPrice();
    }
}