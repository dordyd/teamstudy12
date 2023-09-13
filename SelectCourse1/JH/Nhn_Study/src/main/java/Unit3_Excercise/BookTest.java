package Unit3_Excercise;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String book1Title = sc.next();
        String book1Author = sc.next();
        Book book1 = new Book(book1Title, book1Author);

        String book2Title = sc.next();
        String book2Author = sc.next();
        Book book2 = new Book(book2Title, book2Author);

        book1.printBook();
        book2.printBook();

        int book1Price = sc.nextInt();
        book1.setPrice(book1Price);

        book1.printBookPrice();
    }
}
