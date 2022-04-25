public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String inputTitle, int inputPages, int inputPublicationYear) {
        this.title = inputTitle;
        this.pages = inputPages;
        this.publicationYear = inputPublicationYear;
    }

    public String getName() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
