package chap3;

import java.util.Scanner;
import org.w3c.dom.Text;

public class Practice0308 {
    public static void main(String[] args) {

        TextxBook book1 = TextBook.inputTextBook(b); //1
        //book1.printBook();
        //Book book2 = TextBook.inputTextBook(book1); //2
        Book book3 = TextBook.inputTextBook(book2);
        System.out.println(book2);
        System.out.println(book3);

        book1.setPrice(10000);
        book1.printBookPrice();
    }
}
