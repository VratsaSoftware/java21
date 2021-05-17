package library;

public abstract class Edition {
    private String name;
    private int yearOfRelease;
    private boolean isFree;

    public Edition(String name, int yearOfRelease, boolean isFree) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void book() {
        this.isFree = false;
    }

    public void returnEdition() {
        this.isFree = true;
    }

    public abstract String getDetails();
}
