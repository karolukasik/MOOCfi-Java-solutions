package textstatistics;

import java.util.Arrays;

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

        Label firstLabel = new Label("Letters: 0");
        Label secondLabel = new Label("Words: 0");
        Label thirdLabel = new Label("The longest word is:");
        TextArea textArea = new TextArea("");

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts).sorted((s1, s2) -> s2.length() - s1.length()).findFirst().get();
            firstLabel.setText("Letters: " + characters);
            secondLabel.setText("Words: " + words);
            thirdLabel.setText("The longest word is: " + longest);
        });

        HBox bottomEdgeBox = new HBox(20, firstLabel, secondLabel, thirdLabel);

        layout.setBottom(bottomEdgeBox);
        layout.setCenter(textArea);

        Scene view = new Scene(layout);

        primaryStage.setScene(view);
        primaryStage.show();

    }

}
