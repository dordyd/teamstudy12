package chap3;

public class NovelBook extends Book {
    private String type;

    public NovelBook(String title, String Authors, String type) {
        super(title, Authors);
        this.type = type;
    }
}
