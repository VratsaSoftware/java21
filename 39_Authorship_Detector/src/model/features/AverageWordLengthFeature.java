package model.features;

import java.util.List;

public class AverageWordLengthFeature extends Feature {
    public AverageWordLengthFeature() {
        super(FeatureType.AVERAGE_WORD_LENGTH);
    }

    @Override
    public double calculate(List<String> words, List<String> sentences) {
        return words
                .stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble();
    }
}
