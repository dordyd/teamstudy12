import java.util.Scanner;

public class Book {
    private String name;
    private String author;
    private int price;
    
   
     public Book(){
        
    }
     public Book(String name, String author){
        this.name=name;
        this.author=author;
    }
    public Book(String name, String author,int price){
       //this(name,author,price); //Recursive constructor invocation Book(String, String, int)
        this.name=name;
        this.author=author;
        this.price=price;
    }

    //@Override
    public void printBook(){
        System.out.println("name: "+name+" author: "+author);
    }

    public void printBookPrice(){
        System.out.println("name: "+name+" author: "+author+" +price: "+price);
    }

    public void windowBook(){
        System.out.println("name: "+name+"\nauthor: "+author);
    }

    public String getTitle(){
        return this.name;
    }

    public String getAuthors(){
        return this.author;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public static Book bookInput(){

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();

        Book book=new Book(name,author,price);

        return book;
    }



    
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter information the book1:");
        System.out.print("Name: ");
        String title1 = scanner.nextLine();
        System.out.print("Authors: ");
        String authors1 = scanner.nextLine();
        System.out.print("Course: ");
      

        Book firstBook = new Book(title1, authors1);
       // firstBook.setCourse(course1);
       // firstBook.setFaculty(faculty1);

        System.out.println("\nInformation about the book1:");
        firstBook.printBook();

        System.out.println("\nEnter information for the book2:");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Authors: ");
        String authors2 = scanner.nextLine();

        Book secondBook = new Book(title2, authors2);

        System.out.print("Topic of the book2: ");
        String topic = scanner.nextLine();
        Book thirdBook = new Novel(title2, authors2, topic);

        System.out.println("\nInformation:");
        secondBook.printBook();
        thirdBook.printBook();

        System.out.print("Enter the price of the book1: ");
        double price1 = scanner.nextDouble();
       // firstBook.setPrice(price1);

        System.out.println("\nInformation about the book1:");
        firstBook.printBook();
    }
}
