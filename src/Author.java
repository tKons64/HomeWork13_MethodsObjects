import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    public boolean equals(Author author) {
        if (this == author) return true;
        if (author == null || getClass() != author.getClass()) return false;
        return firstName.equals(author.getFirstName()) && lastName.equals(author.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
