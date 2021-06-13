package data.model;

public class MainCourse extends Food{
    private boolean isVegetarian;

    public MainCourse(String name, float price, boolean isVegetarian) {
        super(name, price);
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}
