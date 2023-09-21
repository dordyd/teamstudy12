package chap3;

import java.util.Scanner;

public class TextBook extends Book {
    private String professor;
    private String lecture;
    private String referenceBook;

    public TextBook(Book book, String professor, String lecture, String referenceBook) {
        super(book.getTitle(), book.getAuthors());
        this.professor = professor;
        this.lecture = lecture;
        this.referenceBook = referenceBook;
    }

    public TextBook(String title, String Authors, String professor, String lecture, String referenceBook) {
        super(title, Authors);
        this.professor = professor;
        this.lecture = lecture;
        this.referenceBook = referenceBook;
    }

    public TextBook(String title, String authors) {
        super(title, authors);
    }

    public TextBook(Book book) {
        super(book.getTitle(), book.getAuthors());
    }

    public static TextBook inputTextBook(Book book) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter professpr: ");
        String professor = scanner.nextLine();
        System.out.print("enter lecture: ");
        String lecture = scanner.nextLine();
        System.out.print("enter referenceBook: ");
        String referenceBook = scanner.nextLine();

        return new TextBook(book, professor, lecture, referenceBook);
    }

    public static TextBook inputTextBook() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter title: ");
        String title = scanner.nextLine();
        System.out.print("enter author: ");
        String author = scanner.nextLine();
        System.out.print("enter professpr: ");
        String professor = scanner.nextLine();
        System.out.print("enter lecture: ");
        String lecture = scanner.nextLine();
        System.out.print("enter referenceBook: ");
        String referenceBook = scanner.nextLine();

        return new TextBook(title, author, professor, lecture, referenceBook);
    }

    @Override
    public String toString() {
        return super.toString() + "professor = " + professor + " lecture = " + lecture + " referenceBook = " +
                referenceBook;
    }
}
