public class Book {
    private String name;
    private String author;
    private int price;
    
    public Book(String name, String author){
        this.name=name;
        this.author=author;
    }

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
}