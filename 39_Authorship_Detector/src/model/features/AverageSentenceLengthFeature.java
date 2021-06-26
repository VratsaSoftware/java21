package model.features;

import java.util.List;

public class AverageSentenceLengthFeature extends Feature{
    public AverageSentenceLengthFeature() {
        super(FeatureType.AVERAGE_SENTENCE_LENGTH);
    }

    @Override
    public double calculate(List<String> words, List<String> sentences) {
        return (double) words.size() / sentences.size();
    }
}
