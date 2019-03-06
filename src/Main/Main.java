package Main;

import Controladores.Controlador1;
import Modelo.Modelo;
import Singleton.Singleton;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);

        Modelo modelo = new Modelo();

        Controlador1 controlador1 = new Controlador1(modelo);

        controlador1.Show();

    }

}
