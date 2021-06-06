package generic_database;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database<T extends DatabaseObject> {
    List<T> listOfObjects = new ArrayList<>();

    public void addToTable(T t) {
        listOfObjects.add(t);
    }

    public void writeToDatabase() {
        for (T t : listOfObjects) {
            System.out.println(t.getId() + " " + t.getValue());
        }
    }

    public void writeToDatabase(boolean flag) {
        if (flag) {
            try (BufferedWriter writer =
                         new BufferedWriter(new FileWriter("database.txt", false));) {
                for (T t : listOfObjects) {
                    writer.write(t.getId() + " " + t.getValue() + System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            writeToDatabase();
        }
    }

}
