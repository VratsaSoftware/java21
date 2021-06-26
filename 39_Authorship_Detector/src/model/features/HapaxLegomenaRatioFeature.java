package model.features;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HapaxLegomenaRatioFeature extends Feature {
    public HapaxLegomenaRatioFeature() {
        super(FeatureType.HAPAX_LEGOMENA_RATIO);
    }

    @Override
    public double calculate(List<String> words, List<String> sentences) {
        Map<String, Long> occurrences = words.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        occurrences.entrySet().removeIf(entry -> entry.getValue() > 1);

        return (double) occurrences.size() / words.size();
    }
}
