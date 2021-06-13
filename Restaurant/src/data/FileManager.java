package data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    String fileNameRead = "menu.csv";
    String fileNameWrite = "menu_modified.csv";

    private final EventCallback callback;

    public FileManager(EventCallback callback) {
        this.callback = callback;
    }

    public void readFile(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> result = read();
                callback.onRead(result);
            }
        }).start();
    }

    public void writeFile(String text) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                write(text);
                callback.onWrite();
            }
        }).start();
    }

    //method that writes in a file
    private void write(String text) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(fileNameWrite))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.out.println("Exception while writing in the file was thrown");
            System.out.println(e.getMessage());
        }
    }

    //method that reads from a file line by line
    private List<String> read() {
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(fileNameRead))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                arrayList.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Exception while reading the file was thrown");
            System.out.println(e.getMessage());
        }

        return arrayList;
    }
}
