import utils.DataConverter;
import data.DataManager;
import data.EventCallback;
import data.FileManager;
import data.model.Food;
import data.model.Salad;
import ui.MainView;
import utils.MenuManager;
import ui.ViewListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements EventCallback {

    private final ViewListener viewListener = new MainView();
    private final MenuManager menuManager = new MenuManager();
    private final FileManager fileManager = new FileManager(this);
    private final DataConverter dataConverter = new DataConverter();
    
    private List<Food> foods = new ArrayList<>();

    public void start(){
        viewListener.printGreetings();
        fileManager.readFile();
    }

    private void chooseOption() {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        while (option != 0) {
            onOptionSelected(option);
            option = input.nextInt();
        }
    }
    

    private void onOptionSelected(int option) {
        switch (option) {
            case 1 -> printItems();
            case 2 -> printSalads();
            case 3 -> printMainCourses();
            case 4 -> printDesserts();
            case 5 -> deleteFood();
            case 6 -> saveFoods();
            default -> handleError();
        }
    }

    private void deleteFood() {
        viewListener.promptForName();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Food food = foods.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst().orElse(null);
        if(food != null){
            foods.remove(food);
            viewListener.printDone();
        } else {
            viewListener.printError();
        }
    }

    private void handleError() {
        viewListener.printError();
    }

    private void printItems() {
        for (Food item :
                foods) {
            viewListener.printItem(item.getName(), String.valueOf(item.getPrice()));
        }
    }

    private void printSalads() {
        List<Salad> salads = menuManager.getSalads(foods);
        for (Salad item :
                salads) {
            viewListener.printSalad(
                    item.getName(),
                    String.valueOf(item.getPrice()),
                    item.getDressing().getName()
            );
        }
    }

    private void printDesserts() {
        //TODO: not yet implemented
    }

    private void printMainCourses() {
        //TODO: not yet implemented
    }

    private void saveFoods() {
        if (DataManager.getInstance().getFoods() != null) {
            fileManager.writeFile(dataConverter.convertToString(
                    DataManager.getInstance().getFoods()
            ));
        }
    }

    @Override
    public void onRead(List<String> result) {
        DataManager.getInstance().setFoods(result);
        viewListener.printOptions();
        foods = DataManager.getInstance().getFoods();
        chooseOption();
    }

    @Override
    public void onWrite() {
        viewListener.printDone();
    }
}
