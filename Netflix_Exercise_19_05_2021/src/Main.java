import controller.Controller;
import database.MovieDatabase;
import io.IOModule;

public class Main {

    public static void main(String[] args) {
        MovieDatabase database = new MovieDatabase();
        IOModule ioModule = new IOModule();
        Controller controller = new Controller(database, ioModule);

        controller.filter("Batman");
    }
}
