package Singleton;

import javafx.stage.Stage;

public class Singleton {

    private static Singleton singleton = null;
    private Stage stage;

    public static Singleton getSingleton() {
        if (Singleton.singleton == null) {
            Singleton.singleton = new Singleton();
        }
        return Singleton.singleton;
    }

    public Stage getStage() {
        return this.stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
