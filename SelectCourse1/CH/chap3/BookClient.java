import java.util.Scanner;

import SelectCourse1.CH.chap3.Book;

public class BookClient {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String author = scan.nextLine();
        String title = scan.nextLine();

        Book firstBook = new Book(author,title);
        author = scan.nextLine();
        title = scan.nextLine();
        Book secondBook = new Book(author, title);

        firstBook.printBook();
        secondBook.printBook();
        firstBook.setPrice(scan.nextInt());
        firstBook.printBookPrice();
        scan.close();

        

    }
}
