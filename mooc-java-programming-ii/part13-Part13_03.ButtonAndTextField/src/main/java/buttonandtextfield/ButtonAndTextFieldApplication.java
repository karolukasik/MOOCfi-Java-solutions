package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button buttonComponent = new Button("Guzik");
        TextField textComponent = new TextField("Pole tekstowe");

        FlowPane componentGroup = new FlowPane();

        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textComponent);

        Scene view = new Scene(componentGroup);

        primaryStage.setScene(view);
        primaryStage.show();

    }

}
