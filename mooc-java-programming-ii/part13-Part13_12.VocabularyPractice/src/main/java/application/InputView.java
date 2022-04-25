package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {
    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {

        Label wordLabel = new Label("Word");
        TextField wordTextField = new TextField();
        Label translationLabel = new Label("Translation");
        TextField translationTextField = new TextField();
        Button addButton = new Button("Add the word pair");

        GridPane layout = new GridPane();
        layout.add(wordLabel, 0, 0);
        layout.add(wordTextField, 0, 1);
        layout.add(translationLabel, 0, 2);
        layout.add(translationTextField, 0, 3);
        layout.add(addButton, 0, 4);
        layout.setVgap(15);
        layout.setAlignment(Pos.CENTER);

        layout.setPadding(new Insets(20));
        layout.setMaxWidth(250);

        addButton.setOnMouseClicked((event) -> {
            this.dictionary.addTranslation(wordTextField.getText(), translationTextField.getText());
            wordTextField.clear();
            translationTextField.clear();
        });

        return layout;
    }
}
