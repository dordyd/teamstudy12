package Unit3_Exercise;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Book book1 = Book.inputBook();
//        book1.printBook();
//
//        System.out.println("Insert Book Price : ");
//        int book1Price = sc.nextInt();
//        book1.setPrice(book1Price);
//
//        book1.printBookPrice();

        TextBook book1 = TextBook.TextBookInput();
        book1.printTextBook();
        System.out.println("==============================");

        Book book2 = Book.inputBook();
        System.out.printf("Insert Book Topic : ");
        String topic = sc.next();

        NovelBook book3 = new NovelBook(book2, topic);
        book3.printNovelBook();
        System.out.println("==============================");

        book1.setPrice(100000);
        book1.pirntTextBookPrice();


    }
}
