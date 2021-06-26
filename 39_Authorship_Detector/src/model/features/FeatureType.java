package model.features;

public enum FeatureType {
    AVERAGE_WORD_LENGTH(11),
    TYPE_TOKEN_RATIO(0.8),
    HAPAX_LEGOMENA_RATIO(0.5),
    AVERAGE_SENTENCE_LENGTH(4),
    AVERAGE_SENTENCE_COMPLEXITY(4);

    private double weight;

    FeatureType(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
