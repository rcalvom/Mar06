package Controladores;

import GUI.Vista2;
import Modelo.Modelo;
import Singleton.Singleton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controlador2 {

    private final Vista2 vista;
    private final Modelo modelo;

    public Controlador2(Modelo modelo) {
        this.modelo = modelo;
        this.vista = new Vista2();
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
            Controlador3 controlador3 = new Controlador3(modelo);
            controlador3.Show();
        }

    }

}
