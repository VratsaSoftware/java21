package library;

public class Magazine extends Edition {
    public Magazine(String name, int yearOfRelease, boolean isFree) {
        super(name, yearOfRelease, isFree);
    }

    @Override
    public String getDetails() {
        return "My magazine";
    }
}
