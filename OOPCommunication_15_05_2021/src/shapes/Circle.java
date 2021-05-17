package shapes;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int findDiameter() {
        return 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        if (radius < 0) {
            throw new IllegalArgumentException();
        }
        return 2 * Math.PI * radius;
    }

    public double[] getCalculations() {
        double[] calculations = new double[2];
        calculations[0] = calculatePerimeter();
        calculations[1] = calculateArea();
        return calculations;
    }
}
