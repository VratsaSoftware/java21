package data;

import java.util.List;

public interface EventCallback {

    void onRead(List<String> result);

    void onWrite();
}
