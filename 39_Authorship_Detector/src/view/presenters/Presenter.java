package view.presenters;

import util.DataType;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface Presenter {
    Map<DataType, List<String>> readDeviceDataFlow() throws IOException;

    void sendDataToDevice(String data) throws IOException;
}
