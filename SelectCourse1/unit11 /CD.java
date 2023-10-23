public class CD {
    String author;
    String title;
    int year;
    int price;

    CD(String author, String title, int year, int price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    boolean equals(CD cd) {
        return this.author.equals(cd.author) && this.title.equals(cd.title) && this.year == cd.year
                && this.price == cd.price;
    }

    public String toString() {
        return author + " " + title + " " + year + " " + price;
    }
}
