package Unit3_Exercise;

public class NovelBook extends Book {

    private String bookTopic;

    public NovelBook(Book book, String bookTopic) {
        super(book.getTitle(), book.getAuthors());
        this.bookTopic = bookTopic;
    }

    public void printNovelBook() {
        System.out.println(this);
    }

    public String toString() {
        return super.toString() + "\nBook Topic  : " + this.bookTopic;
    }
}
