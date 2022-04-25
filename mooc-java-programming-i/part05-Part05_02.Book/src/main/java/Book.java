import javax.sql.rowset.spi.TransactionalWriter;

public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.name = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
