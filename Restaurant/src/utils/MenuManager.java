package utils;

import data.model.Food;
import data.model.Salad;

import java.util.List;
import java.util.stream.Collectors;

public class MenuManager {

    public List<Salad> getSalads(List<Food> menu){
        return  menu.stream()
                .filter(item -> item instanceof Salad)
                .map(item -> (Salad) item)
                .collect(Collectors.toList());
    }
}
