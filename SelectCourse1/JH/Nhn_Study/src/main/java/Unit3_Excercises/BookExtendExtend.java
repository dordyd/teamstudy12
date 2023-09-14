package Unit3_Excercises;

public class BookExtendExtend extends Book {

    private String bookTopic;

    public BookExtendExtend(Book book, String bookTopic) {
        super(book.getTitle(), book.getAuthors());
        this.bookTopic = bookTopic;
    }

    public void printBookExtendExtend() {
        System.out.println(this);
    }

    public String toString() {
        return super.toString() + "\nBook Topic  : " + this.bookTopic;
    }
}
