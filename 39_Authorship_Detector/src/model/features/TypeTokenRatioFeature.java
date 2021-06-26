package model.features;

import java.util.List;

public class TypeTokenRatioFeature extends Feature {
    public TypeTokenRatioFeature() {
        super(FeatureType.TYPE_TOKEN_RATIO);
    }

    @Override
    public double calculate(List<String> words, List<String> sentences) {
        return (double) words.stream().distinct().count() / words.size();
    }
}
