package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label textComponent = new Label("Grecia");
        Button buttonComponent = new Button("Felcia");

        FlowPane componentGroup = new FlowPane();

        componentGroup.getChildren().add(textComponent);
        componentGroup.getChildren().add(buttonComponent);

        Scene view = new Scene(componentGroup);

        primaryStage.setScene(view);
        primaryStage.show();

    }

}
