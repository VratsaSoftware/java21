package model.features;

import java.util.List;

public abstract class Feature {
    protected FeatureType type;

    public Feature(FeatureType type) {
        this.type = type;
    }

    public FeatureType getType() {
        return type;
    }

    public abstract double calculate(List<String> words, List<String> sentences);
}
