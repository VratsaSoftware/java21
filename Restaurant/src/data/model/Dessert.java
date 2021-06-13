package data.model;

public class Dessert extends Food {
    // 1 - 10
    private int levelOfSweetness;

    public Dessert(String name, float price, int levelOfSweetness) {
        super(name, price);
        if (levelOfSweetness >= 0 && levelOfSweetness <= 10) {
            this.levelOfSweetness = levelOfSweetness;
        }
    }

    public int getLevelOfSweetness() {
        return levelOfSweetness;
    }

    public void setLevelOfSweetness(int levelOfSweetness) {
        if (levelOfSweetness >= 0 && levelOfSweetness <= 10) {
            this.levelOfSweetness = levelOfSweetness;
        }
    }
}
