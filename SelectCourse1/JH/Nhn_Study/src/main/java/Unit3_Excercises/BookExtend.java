package Unit3_Excercises;

import java.util.Scanner;

public class BookExtend extends Book {
    private String textBookCourse;
    private String textBookFaculty;


    public BookExtend(Book book, String textBookCourse, String textBookFaculty) {
        super(book.getTitle(), book.getAuthors());
        this.textBookCourse = textBookCourse;
        this.textBookFaculty = textBookFaculty;
    }


    public static BookExtend BookExtendInput() {
        Scanner sc = new Scanner(System.in);
        Book book = inputBook();

        System.out.printf("Insert Book Course : ");
        String course = sc.next();

        System.out.printf("Insert Book Faculty : ");
        String faculty = sc.next();

        return new BookExtend(book, course, faculty);

    }


    public void printBookExtend() {
        printBook();
        System.out.println("Course : " + this.textBookCourse);
        System.out.println("Facility : " + this.textBookFaculty);
    }


    public void pirntBookExtendPrice() {
        System.out.println("Course : " + this.textBookCourse);
        System.out.println("Facility : " + this.textBookFaculty);
        printBookPrice();

    }
}
