import java.util.Scanner;

public class BookTest {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String author=sc.nextLine();

        Book book1=new Book(name,author);

        String name2=sc.nextLine();
        String author2=sc.nextLine();

        Book book2=new Book(name2,author2);

        book1.windowBook();
        book2.windowBook();

        int price=sc.nextInt();
        book1.setPrice(price);

        book1.printBookPrice();

        sc.close();

    }
}