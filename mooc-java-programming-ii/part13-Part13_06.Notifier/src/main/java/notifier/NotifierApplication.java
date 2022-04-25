package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField textField = new TextField("");
        Button updateButton = new Button("Update");
        Label textLabel = new Label("");

        updateButton.setOnAction((event) -> {
            textLabel.setText(textField.getText());
        });

        textField.textProperty().addListener((change, oldValue, newValue) -> {
            System.out.println(oldValue + " -> " + newValue);
            textLabel.setText(newValue);
        });

        VBox layout = new VBox(10, textField, updateButton, textLabel);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();

    }

}
