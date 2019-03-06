package GUI;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Vista2  {

    private final Label label1, label2;
    private final TextField textField1, textField2;
    private final Button button;
    private final Scene scene;

    public Vista2() {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(50, 50, 50, 50));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        this.label1 = new Label("X");
        this.textField1 = new TextField();
        this.label2 = new Label("Y");
        this.textField2 = new TextField();
        this.button = new Button("Sigiente x2");
        GridPane.setHalignment(button, HPos.CENTER);

        gridPane.add(this.label1, 0, 0);
        gridPane.add(this.textField1, 1, 0);
        gridPane.add(this.label2, 0, 1);
        gridPane.add(this.textField2, 1, 1);
        gridPane.add(this.button, 1, 2);

        this.scene = new Scene(gridPane, 200, 200);

    }

    public Label getLabel1() {
        return label1;
    }

    public Label getLabel2() {
        return label2;
    }

    public TextField getTextField1() {
        return textField1;
    }

    public TextField getTextField2() {
        return textField2;
    }

    public Button getButton() {
        return this.button;
    }

    public void Show(Stage primaryStage) {
        primaryStage.setScene(this.scene);
        primaryStage.setTitle("Vista2");
        primaryStage.show();
    }

}
