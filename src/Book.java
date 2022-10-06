import java.util.Objects;

public class Book {

    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return getAuthor().toString() + ": " + getTitle() + ": " + getPublicationYear();
    }


    public boolean equals(Book book) {
        if (this == book) return true;
        if (book == null || getClass() != book.getClass()) return false;

        if (publicationYear != book.publicationYear) return false;
        if (title.equals(book.getTitle())) return false;
        return (author.equals(book.author));
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + publicationYear;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
