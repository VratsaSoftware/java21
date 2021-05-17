package library;

public class Library {
    private String name;
    private String address;
    private String workingHours;
    private Edition[] editions;
    private int numberOfEditions = 0;

    public Library(String name, String address, String workingHours) {
        this.name = name;
        this.address = address;
        this.workingHours = workingHours;

        editions = new Edition[100];
        for (int i = 0; i < 6; i++) {
            editions[numberOfEditions] =
                    new Newspaper("Newspaper" + i,
                            2010 + i,
                            i % 2 == 0);
            numberOfEditions++;
        }

        for (int i = 0; i < 6; i++) {
            editions[numberOfEditions] =
                    editions[i + numberOfEditions] =
                            new Book(
                            "Book" + i,
                            2010 + i,
                            i % 2 == 0,
                            "Author" + i);

            numberOfEditions++;
        }

    }

    public boolean bookEdition(Edition edition) {
        for (int i = 0; i < numberOfEditions; i++) {
            if(this.editions[i].getDetails().equals(edition.getDetails())) {
                if(this.editions[i].isFree()) {
                    this.editions[i].book();
                    return true;
                }
            }
        }
        return false;
    }

    public void addEdition(Edition edition) {
        if(this.numberOfEditions + 1 < 100) {
            this.editions[this.numberOfEditions] = edition;
            this.numberOfEditions++;
        }
    }

    public void getDetails() {
        for (int i = 0; i < numberOfEditions; i++) {
            System.out.println(this.editions[i].getDetails());
        }
    }
}
