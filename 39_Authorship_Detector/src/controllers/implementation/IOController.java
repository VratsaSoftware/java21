package controllers.implementation;

import controllers.Controller;
import model.LinguisticSignature;
import model.LinguisticSignatureCalculator;
import util.DataType;
import view.presenters.Presenter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOController implements Controller {

    private LinguisticSignatureCalculator calculator;
    private Presenter presenter;

    public IOController(Presenter presenter) {
        this.presenter = presenter;
        this.calculator = new LinguisticSignatureCalculator();
    }

    @Override
    public double findSimilarity(Map<DataType, List<String>> first, Map<DataType, List<String>> second) {
        LinguisticSignature signature1 = calculator.calculateSignature(first.get(DataType.WORDS),
                first.get(DataType.SENTENCES));

        LinguisticSignature signature2 = calculator.calculateSignature(second.get(DataType.WORDS),
                second.get(DataType.SENTENCES));

        return calculator.calculateSimilarities(signature1, signature2);
    }

    @Override
    public void start() {
        try {
            Map<DataType, List<String>> data = this.presenter.readDeviceDataFlow();

            Map<DataType, List<String>> sampleData = new HashMap<>();

            List<String> sampleWords = new ArrayList<>();
            sampleWords.add("Hello");
            List<String> sampleSentences = new ArrayList<>();
            sampleSentences.add("This is a sentence");

            sampleData.put(DataType.WORDS, sampleWords);
            sampleData.put(DataType.SENTENCES, sampleSentences);

            findSimilarity(data, sampleData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
