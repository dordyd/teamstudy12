package SelectCourse1.CH.chap3;

import javax.swing.JOptionPane;

public class Book {

    static Scanner scan = new Scanner(System.in);
    
    private String title;
    private String authors;
    private int price;

    public Book(String title, String authors){
        this.title = title;
        this.authors = authors;
    }

    public Book(String title, String authors, int price){
        this.title = title;
        this.authors = authors;
        this. price = price;
    }

    public void printBook(){
        System.out.println("title : " + title);
        System.out.println("authors : " + authors);
    }

    public void printBookPrice(){
        printBook();
        System.out.println("price : " + price);
    }

    public void windowBook(){
        String tmp = authors + "\n" + title ;
        JOptionPane.showMessageDialog(null, tmp);
    }

    public String getAuthors() {
        return authors;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static readInput(){

    }

}
