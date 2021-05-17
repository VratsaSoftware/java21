import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FileManager {
    String fileNameRead = "baskerville.txt";
    String fileNameWrite = "baskerville_modified.txt";

    //method that writes in a file
    public void write(String text) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(fileNameWrite))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.out.println("Exception while writing in the file was thrown");
            System.out.println(e.getMessage());
        }
    }

    //method that reads a file and returns an array containing all words
    public String read() {
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

        return arrayList
                .stream()
                .map(s -> s.split("\\s+"))
                .flatMap(Arrays::stream)
                .filter(line -> !line.isEmpty() && !line.isBlank())
                .map(FileManager::cleanUp)
                .collect(Collectors.joining(" "));
    }

    public static String cleanUp(String word) {
        return word.toLowerCase()
                .replaceAll("^[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\n\\t\\\\]+|[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\n\\t\\\\]+$", "")
                .replaceAll("\\)", "");
    }
}