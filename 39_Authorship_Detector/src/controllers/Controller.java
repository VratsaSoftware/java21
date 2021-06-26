package controllers;

import util.DataType;

import java.util.List;
import java.util.Map;

public interface Controller {
    double findSimilarity(Map<DataType, List<String>> first, Map<DataType, List<String>> second);

    void start();
}
