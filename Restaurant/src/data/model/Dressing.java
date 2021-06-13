package data.model;

import static utils.Constants.*;

public enum Dressing {

    Mayo(DRESSING_MAYO,"Mayo"),
    Pesto(DRESSING_PESTO,"Pesto"),
    GarlicMayo(DRESSING_GARLIC_MAYO,"Garlic mayo"),
    OliveOil(DRESSING_OLIVE_OIL,"Olive oil"),
    Mediterranean(DRESSING_MEDITERRANEAN,"Mediterranean");

    private final String key;
    private final String name;

    Dressing(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }
}
