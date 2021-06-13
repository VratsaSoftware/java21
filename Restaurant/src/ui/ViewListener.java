package ui;

public interface ViewListener {

    void printSalad(String name, String price, String dressing);

    void printItem(String name, String price);

    void printOptions();

    void printDone();

    void printError();

    void promptForName();

    void printGreetings();
}
