package Unit3_Excercises;

import java.util.Scanner;

public class TextBook extends Book {
    private final String textBookCourse;
    private final String textBookFaculty;


    private TextBook(Book book, String textBookCourse, String textBookFaculty) {
        super(book.getTitle(), book.getAuthors());
        this.textBookCourse = textBookCourse;
        this.textBookFaculty = textBookFaculty;
    }


    public static TextBook TextBookInput() {
        Scanner sc = new Scanner(System.in);
        Book book = inputBook();

        System.out.printf("Insert Book Course : ");
        String course = sc.nextLine();

        System.out.printf("Insert Book Faculty : ");
        String faculty = sc.nextLine();

        return new TextBook(book, course, faculty);

    }


    public void printTextBook() {
        System.out.println(this);
    }


    public void pirntTextBookPrice() {
        System.out.println(this);
        System.out.println("Price : " + getPrice() + "원");

    }

    @Override
    public String toString() {
        return super.toString() + "\nCourse : " + this.textBookCourse + "\nFaculty : " + this.textBookFaculty;
    }


}
