package Unit3_Excercises;

public class BookExtendExtend extends Book {

    private String BookTopic;

    public BookExtendExtend(Book book, String BookTopic) {
        super(book.getTitle(), book.getAuthors());
        this.BookTopic = BookTopic;
    }

    public void printBookExtendExtend() {
        printBook();
        System.out.println("Book Topic : " + this.BookTopic);
    }
}
