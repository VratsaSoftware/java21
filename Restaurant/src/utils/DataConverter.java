package utils;

import data.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static utils.Constants.*;

public class DataConverter {

    public List<Food> convertToFoods(List<String> text) {
        List<Food> foods = new ArrayList<>();

        for (String line :
                text.stream().skip(1).collect(Collectors.toList()) //skip first line of csv (header)
        ) {
            String[] dishText = line.split(SPLIT_REGEX);

            Food currentDish = null;

            if (dishText[5].equals(FOOD_TYPE_SALAD)) {
                Dressing dressing = getDressing(dishText[2]);
                currentDish = new Salad(dishText[0], Float.parseFloat(dishText[1]), dressing);
            }

            if (currentDish != null) {
                foods.add(currentDish);
            }
        }
        return foods;
    }

    private Dressing getDressing(String dressingText) {
        return switch (dressingText) {
            case DRESSING_GARLIC_MAYO -> Dressing.GarlicMayo;
            case DRESSING_PESTO -> Dressing.Pesto;
            case DRESSING_MEDITERRANEAN -> Dressing.Mediterranean;
            case DRESSING_MAYO -> Dressing.Mayo;
            default -> Dressing.OliveOil;
        };
    }

    public String convertToString(List<Food> foods) {
        StringBuilder result = new StringBuilder(CSV_HEADER);
        String line = null;
        for (Food food :
                foods) {
            if (food instanceof Salad) {
                line = food.getName() + "," + food.getPrice() + "," +
                        ((Salad) food).getDressing().getKey() + ",,," + FOOD_TYPE_SALAD;
            }
            if(line != null){
                result.append("\n").append(line);
            }
        }
        return result.toString();
    }
}
