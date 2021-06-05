package streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {

    public static void main(String[] args) {
        try (InputStream inputStream =
                     new FileInputStream("names.txt");
             OutputStream os =
                     new FileOutputStream("sorted.txt", false);) {

            List<String> names = new ArrayList<>();
            List<Character> currentNameLetters = new ArrayList<>();
            int data;

            while ((data = inputStream.read()) != -1) {
                if ((char) data != '\n') {
                    currentNameLetters.add((char) data);
                } else {
                    String name = currentNameLetters.toString().replaceAll("[,\\s\\[\\]]", "");
                    names.add(name);
                    currentNameLetters.clear();
                }
            }

            for (String name : names) {
                System.out.println(name);
            }

            List<String> sortedNames = names
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());

            for (String name : sortedNames) {
                System.out.println(name);
            }

            for (String name : sortedNames) {
                for (char letter : name.toCharArray()) {
                    os.write(letter);
                }
                os.write('\n');
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
