import java.util.Scanner;

public class Book02 {
    private String name;
    private String author;
    private int price;
    
    public Book02(String name, String author){
        this.name=name;
        this.author=author;
    }

    public void printBookPrice(){
        System.out.println("Book name: "+name+" author: "+author+" +price: "+price);
    }

    public void windowBook(){
        System.out.println("Book name: "+name+"\nauthor: "+author);
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String author=sc.nextLine();

        Book02 book1=new Book02(name,author);

        String name2=sc.nextLine();
        String author2=sc.nextLine();

        Book02 book2=new Book02(name2,author2);

        book1.windowBook();
        book2.windowBook();

        int price=sc.nextInt();
        book1.setPrice(price);

        book1.printBookPrice();

        sc.close();

    }
}