package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Dictionary dictionary = new Dictionary();

        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);

        Button addingButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");
        HBox menu = new HBox(10, addingButton, practiceButton);

        BorderPane layout = new BorderPane();
        layout.setTop(menu);
        layout.setCenter(inputView.getView());

        addingButton.setOnAction((event) -> {
            layout.setCenter(inputView.getView());
        });
        practiceButton.setOnAction((event) -> {
            layout.setCenter(practiceView.getView());
        });

        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}
