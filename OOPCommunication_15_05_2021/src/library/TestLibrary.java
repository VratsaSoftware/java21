package library;

import library.Book;
import library.Library;
import library.Magazine;
import library.Newspaper;

public class TestLibrary {

    public static void main(String[] args) {
        Library library = new Library("My library", "My address", "9:00-18:00");
        library.getDetails();

        library.addEdition(new Newspaper("Cool newspaper", 2021, true));
        library.addEdition(new Book("Cool book", 2021, true, "Cool author"));
        library.addEdition(new Magazine("Cool magazine", 2021, true));

        library.getDetails();
    }
}
