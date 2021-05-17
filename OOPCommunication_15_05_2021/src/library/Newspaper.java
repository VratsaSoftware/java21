package library;

public class Newspaper extends Edition {
    public Newspaper(String name, int yearOfRelease, boolean isFree) {
        super(name, yearOfRelease, isFree);
    }

    @Override
    public String getDetails() {
        return "Name: " + getName() + " Year: " + getYearOfRelease();
    }
}
