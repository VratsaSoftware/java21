package communication;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void igniteEngine() {
        engine.start();
    }
}
