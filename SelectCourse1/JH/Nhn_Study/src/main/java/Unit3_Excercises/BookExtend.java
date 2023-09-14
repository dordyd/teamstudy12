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
        String course = sc.nextLine();

        System.out.printf("Insert Book Faculty : ");
        String faculty = sc.nextLine();

        return new BookExtend(book, course, faculty);

    }


    public void printBookExtend() {
        System.out.println(this);
    }


    public void pirntBookExtendPrice() {
        System.out.println(this);
        System.out.println("Price : " + getPrice() + "원");

    }

    @Override
    public String toString() {
        return super.toString() + "\nCourse : " + this.textBookCourse + "\nFaculty : " + this.textBookFaculty;
    }


}
