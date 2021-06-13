package data.model;

public class Salad extends Food{
    private Dressing dressing;

    public Salad(String name, float price, Dressing dressing) {
        super(name, price);
        this.dressing = dressing;
    }

    public Dressing getDressing() {
        return dressing;
    }

    public void setDressing(Dressing dressing) {
        this.dressing = dressing;
    }
}
