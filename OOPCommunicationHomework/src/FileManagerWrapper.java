import java.io.File;

public class FileManagerWrapper {

    private FileManager textManager = new FileManager();

    //You can change the method signature
    public void readTextFile() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String result = textManager.read();
                //Add your code here
            }
        }).start();
    }

    //You can change the method signature
    public void writeTextFile(String text) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                textManager.write(text);
                //Add your code here
            }
        }).start();
    }

}