import controllers.Controller;
import controllers.implementation.IOController;
import view.devices.Device;
import view.devices.implementation.ConsoleDevice;
import view.devices.implementation.FileDevice;
import view.presenters.Presenter;
import view.presenters.implementation.IOPresenter;

public class Application {
    public static void main(String[] args) {
        //Device device = new FileDevice("sampleFile.txt", "test.txt");
        Device device = new ConsoleDevice();
        Presenter presenter = new IOPresenter(device);

        Controller controller = new IOController(presenter);
        controller.start();
    }
}
