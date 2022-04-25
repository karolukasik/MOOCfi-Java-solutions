package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // first view
        Label instructionLabel = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button textFieldAccept = new Button("Start");
        GridPane firstView = new GridPane();
        firstView.add(instructionLabel, 1, 0);
        firstView.add(textField, 1, 1);
        firstView.add(textFieldAccept, 1, 2);

        firstView.setPrefSize(300, 180);
        firstView.setAlignment(Pos.CENTER);
        firstView.setVgap(15);
        firstView.setPadding(new Insets(20));

        // second view
        Label secondViewLabel = new Label("");
        BorderPane secondView = new BorderPane(secondViewLabel);
        secondView.setPrefSize(300, 180);

        Scene firstScene = new Scene(firstView);
        Scene secondScene = new Scene(secondView);

        textFieldAccept.setOnAction((event) -> {
            secondViewLabel.setText("Welcome " + textField.getText().trim() + "!");
            primaryStage.setScene(secondScene);
        });

        primaryStage.setScene(firstScene);
        primaryStage.show();

    }

}
