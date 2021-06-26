package view.devices.implementation;

import view.devices.Device;

import java.io.IOException;
import java.util.Collection;

public class ConsoleDevice implements Device {

    @Override
    public Collection<String> read() throws IOException {
        return null;
    }

    @Override
    public void write(String text) {

    }
}
