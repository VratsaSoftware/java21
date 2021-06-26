package view.devices.implementation;

import view.devices.Device;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class FileDevice implements Device {

    private String inputDirectory;
    private String outputDirectory;

    public FileDevice(String inputDirectory, String outputDirectory) {
        this.inputDirectory = inputDirectory;
        this.outputDirectory = outputDirectory;
    }

    @Override
    public Collection<String> read() throws FileNotFoundException {
        Collection<String> lines = Collections.emptyList();

        InputStream stream = new FileInputStream(inputDirectory);

        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(stream))) {
            lines = buffer.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void write(String text) throws IOException {
        OutputStream outputStream = new FileOutputStream(outputDirectory, true);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
            writer.write(text + System.lineSeparator());
        }
    }
}
