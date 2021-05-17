package library;

public class Book extends Edition {

    private String author;

    public Book(String name, int yearOfRelease, boolean isFree, String author) {
        super(name, yearOfRelease, isFree);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Name: " + getName() + " Author: " + this.author;
    }
}
