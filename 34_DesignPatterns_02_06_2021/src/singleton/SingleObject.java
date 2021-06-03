package singleton;

public class SingleObject {

    private String name;

    //create an object of SingleObject
    private static SingleObject instance = null;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){
        this.name = "Preslava";
    }

    //Get the only object available
    public static SingleObject getInstance(){
        if (instance == null) {
            instance = new SingleObject();
            return instance;
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}