package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {
    Dictionary dictionary;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        String wordToPractice = dictionary.randomWord();
        Label instruction = new Label("Translate the word \"" + wordToPractice + "\"");
        TextField userInput = new TextField();
        Button checkButton = new Button("Check");
        Label message = new Label("");

        layout.add(instruction, 0, 0);
        layout.add(userInput, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(message, 0, 3);
        layout.setVgap(15);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);

        checkButton.setOnAction((event) -> {
            String userTranslation = userInput.getText();
            String correctTranslation = dictionary.getTranslation(wordToPractice);
            if (userTranslation.equals(correctTranslation)) {
                message.setText("Correct!");
            } else {
                message.setText("Incorrect! The correct translation of \"" + wordToPractice + " is \""
                        + correctTranslation + "\".");
            }
            userInput.clear();
        });

        return layout;
    }
}
