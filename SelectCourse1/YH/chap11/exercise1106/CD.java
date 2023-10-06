package chap11.exercise1106;

import java.util.Objects;

public class CD {
    private String author;
    private String title;
    private String pubYear;
    private long price;

    public CD(String author, String title, String pubYear, long price) {
        this.author = author;
        this.title = title;
        this.pubYear = pubYear;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPubYear() {
        return pubYear;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "author = " + author + "\t, title = " + title + "\t, pubYear =" + pubYear +"\t, price = " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CD cd = (CD) o;
        return price == cd.price && Objects.equals(author, cd.author) &&
                Objects.equals(title, cd.title) && Objects.equals(pubYear, cd.pubYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, pubYear, price);
    }
}
