package Controladores;

import GUI.Vista3;
import Modelo.Modelo;
import Singleton.Singleton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controlador3 {

    private final Vista3 vista;
    private final Modelo modelo;

    public Controlador3(Modelo modelo) {
        this.modelo = modelo;
        this.vista = new Vista3();
        this.vista.getButton().setOnAction(new EventoBoton2());
        vista.getTextField1().setText(modelo.getX());
        vista.getTextField2().setText(modelo.getY());
    }

    public void Show() {
        Singleton singleton = Singleton.getSingleton();
        this.vista.Show(singleton.getStage());
    }

    class EventoBoton2 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            modelo.setX(vista.getTextField1().getText());
            modelo.setY(vista.getTextField2().getText());
            Controlador1 controlador1 = new Controlador1(modelo);
            controlador1.Show();
        }

    }

}
