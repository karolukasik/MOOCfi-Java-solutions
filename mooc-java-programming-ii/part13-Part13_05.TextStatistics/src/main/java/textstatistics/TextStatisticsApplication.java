package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane layout = new BorderPane();

        HBox bottomEdgeBox = new HBox();
        bottomEdgeBox.setSpacing(10);
        Label firstLabel = new Label("Letters: 0");
        Label secondLabel = new Label("Words: 0");
        Label thirdLabel = new Label("The longest word is:");
        bottomEdgeBox.getChildren().add(firstLabel);
        bottomEdgeBox.getChildren().add(secondLabel);
        bottomEdgeBox.getChildren().add(thirdLabel);

        layout.setBottom(bottomEdgeBox);
        layout.setCenter(new TextArea(""));

        Scene view = new Scene(layout);

        primaryStage.setScene(view);
        primaryStage.show();

    }

}
