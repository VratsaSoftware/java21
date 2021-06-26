package view.presenters.implementation;

import util.DataType;
import util.TextStripper;
import view.devices.Device;
import view.presenters.Presenter;

import java.io.IOException;
import java.util.*;

public class IOPresenter implements Presenter {
    private Device device;
    private TextStripper stripper;

    public IOPresenter(Device device) {
        this.device = device;
        this.stripper = new TextStripper();
    }

    @Override
    public Map<DataType, List<String>> readDeviceDataFlow() throws IOException {
        Collection<String> input = this.device.read();

        Map<DataType, List<String>> textData = new HashMap<>();
        textData.put(DataType.WORDS, stripper.generateCleanStringCollection(input));
        textData.put(DataType.SENTENCES, stripper.generateCleanSentenceCollection(input));

        return textData;
    }

    @Override
    public void sendDataToDevice(String data) throws IOException {
        device.write(data);
    }
}
