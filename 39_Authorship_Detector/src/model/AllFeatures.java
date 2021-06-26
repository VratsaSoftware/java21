package model;

import model.features.*;

public class AllFeatures {
    private final Feature[] features;

    public AllFeatures() {
        this.features = new Feature[]{
                new AverageWordLengthFeature(),
                new TypeTokenRatioFeature(),
                new HapaxLegomenaRatioFeature(),
                new AverageSentenceLengthFeature(),
                new AverageSentenceComplexityFeature()
        };
    }

    public Feature[] getFeatures() {
        return features;
    }
}
