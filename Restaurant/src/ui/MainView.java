package ui;

public class MainView implements ViewListener {
    @Override
    public void printSalad(String name, String price, String dressing) {
        System.out.println(name + " with dressing " + dressing + " - " + price + "$");

    }

    @Override
    public void printItem(String name, String price) {
        System.out.println(name + " - " + price + "$");
    }

    @Override
    public void printOptions() {
        System.out.println("""
                choose an option:
                (0) exit
                (1) print menu
                (2) print salads
                (3) print main courses (not yet implemented)
                (4) print desserts (not yet implemented)
                (5) delete item (by name)
                (6) save""");
    }

    @Override
    public void printDone() {
        System.out.println("Done!");
    }


    @Override
    public void printError() {
        System.out.println("Something went wrong!");
    }

    @Override
    public void promptForName() {
        System.out.println("Please enter food name: ");
    }

    @Override
    public void printGreetings() {
        System.out.println("Hello!");
    }

}
