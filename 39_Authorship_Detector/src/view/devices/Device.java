package view.devices;

import java.io.IOException;
import java.util.Collection;

public interface Device {
    Collection<String> read() throws IOException;

    void write(String text) throws IOException;
}
