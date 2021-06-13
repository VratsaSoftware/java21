package data;

import data.model.Food;
import utils.DataConverter;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static DataManager instance;
    private final DataConverter dataConverter = new DataConverter();
    private List<Food> foods;

    public List<Food> getFoods() {
        if (foods != null) {
            return foods;
        }
        return new ArrayList<>();
    }

    public void setFoods(List<String> result){
        foods = dataConverter.convertToFoods(result);
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }
}
