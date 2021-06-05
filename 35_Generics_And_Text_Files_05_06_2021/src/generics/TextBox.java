package generics;

public class TextBox {
    public static void main(String[] args) {
//        Box<String> boxWithStrings = new Box<>();
//        boxWithStrings.set("Preslava");

        Box<Integer> boxWithIntegers = new Box<>();
        boxWithIntegers.set(9);

        Box<Double> boxWithDoubles = new Box<>();
        boxWithDoubles.set(9.0);

    }
}
