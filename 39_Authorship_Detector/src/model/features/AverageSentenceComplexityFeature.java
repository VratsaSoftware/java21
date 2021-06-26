package model.features;

import java.util.Arrays;
import java.util.List;

public class AverageSentenceComplexityFeature extends Feature {
    public AverageSentenceComplexityFeature() {
        super(FeatureType.AVERAGE_SENTENCE_COMPLEXITY);
    }

    @Override
    public double calculate(List<String> words, List<String> sentences) {
        long numberOfPhrases = sentences.stream()
                .filter(s -> s.matches(".*[\\,\\;\\:].*"))
                .map(s -> s.split("[,|\\:|\\;]"))
                .flatMap(Arrays::stream)
                .count();

        return (double) numberOfPhrases / sentences.size();
    }

}
