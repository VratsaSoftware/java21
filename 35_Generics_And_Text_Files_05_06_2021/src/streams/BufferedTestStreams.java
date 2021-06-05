package streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BufferedTestStreams {
    public static void main(String[] args) {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("names.txt"));
             BufferedWriter writer =
                     new BufferedWriter(new FileWriter("buffered_sorted.txt", false));) {

            List<String> names = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                names.add(line);
            }

            List<String> sortedNames = names.stream()
                    .sorted()
                    .collect(Collectors.toList());

            for (String name : sortedNames) {
                writer.write(name + '\n');
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
