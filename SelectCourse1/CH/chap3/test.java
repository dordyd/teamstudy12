import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] params = {"title", "authors", "course", " faculty"};
        String[] input = new String[4];
        for(int i = 0; i < params.length; i++){
            System.out.println("Type " + params[i] + " of book");
            input[i] = scan.nextLine();
        }
        
        BolzanoTextBook bolza = new BolzanoTextBook(input[0],input[1],input[2],input[3]);
        bolza.printBook();

        for(int i = 0; i < 2; i++){
            System.out.println("Type " + params[i] + " of book");
            input[i] = scan.nextLine();
        }
        Book book = new Book(input[0],input[1]);

        System.out.println("novel Type? ");
        Novel novel = new Novel(book.getTitle(), book.getAuthors(), scan.nextLine());
        
        System.out.println(novel);

        novel.printBook();
        System.out.print(bolza.getTitle() + " price : ");
        bolza.setPrice(scan.nextInt());

        bolza.printBookPrice();

        

    }
}
