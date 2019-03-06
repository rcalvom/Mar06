package Controladores;

import GUI.Vista1;
import Modelo.Modelo;
import Singleton.Singleton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controlador1 {

    private final Vista1 vista;
    private final Modelo modelo;

    public Controlador1(Modelo modelo) {
        this.modelo = modelo;
        this.vista = new Vista1();
        this.vista.getButton().setOnAction(new EventoBoton1());
        vista.getTextField1().setText(modelo.getX());
        vista.getTextField2().setText(modelo.getY());
    }

    public void Show() {
        Singleton singleton = Singleton.getSingleton();
        this.vista.Show(singleton.getStage());
    }

    class EventoBoton1 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            modelo.setX(vista.getTextField1().getText());
            modelo.setY(vista.getTextField2().getText());
            Controlador2 controlador2 = new Controlador2(modelo);
            controlador2.Show();
        }

    }

}
