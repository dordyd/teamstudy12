package Unit3_Excercises;

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

        BookExtend book1 = BookExtend.BookExtendInput();
        book1.printBookExtend();
        System.out.println("==============================");

        Book book2 = Book.inputBook();
        System.out.printf("Insert Book Topic : ");
        String topic = sc.next();

        BookExtendExtend book3 = new BookExtendExtend(book2, topic);
        book3.printBookExtendExtend();
        System.out.println("==============================");

        book1.setPrice(100000);
        book1.pirntBookExtendPrice();


    }
}
