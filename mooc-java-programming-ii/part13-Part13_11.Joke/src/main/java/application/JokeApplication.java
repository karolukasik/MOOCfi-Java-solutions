package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    StackPane jokeLayout;
    StackPane answerLayout;
    StackPane explanationLayout;
    StackPane addingJokeLayout;

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ArrayList<String[]> listOfJokes = new ArrayList<>();
        String[] gummyBearJoke = { "What do you call a bear with no teeth?", "A gummy bear.",
                "Gummy in the means of gums in the mouth" };
        String[] alienJoke = { "Co mówi obcy schodząc z góry?", "No stromo",
                "Nawiązanie do filmu \"Obcy - ósmy pasażer Nostromo\"" };
        String[] programmerJoke = { "Skąd programista bierze wodę?", "Z ekranu",
                "e-kranu jak e-mail" };
        listOfJokes.add(alienJoke);
        listOfJokes.add(gummyBearJoke);
        listOfJokes.add(programmerJoke);

        BorderPane layout = new BorderPane();

        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");
        Button changeJoke = new Button("Draw another joke");
        Button addJoke = new Button("Add new joke");
        HBox menu = new HBox(15, jokeButton, answerButton, explanationButton, changeJoke, addJoke);
        menu.setPadding(new Insets(20, 20, 20, 20));

        layout.setTop(menu);

        String[] joke = listOfJokes.get(0);

        // joke view
        jokeLayout = createView(joke[0]);
        answerLayout = createView(joke[1]);
        explanationLayout = createView(joke[2]);

        jokeButton.setOnAction((event) -> {
            layout.setCenter(jokeLayout);
        });
        answerButton.setOnAction((event) -> {
            layout.setCenter(answerLayout);
        });
        explanationButton.setOnAction((event) -> {
            layout.setCenter(explanationLayout);
        });
        changeJoke.setOnAction((event) -> {
            Random rnd = new Random();
            int index = rnd.nextInt(listOfJokes.size());
            System.out.println(index);
            String[] newJoke = listOfJokes.get(index);
            jokeLayout = createView(newJoke[0]);
            answerLayout = createView(newJoke[1]);
            explanationLayout = createView(newJoke[2]);
            layout.setCenter(jokeLayout);
        });
        addJoke.setOnAction((event) -> {
            addingJokeLayout = addingJoke(listOfJokes);
            layout.setCenter(addingJokeLayout);
        });

        layout.setCenter(jokeLayout);

        Scene scene = new Scene(layout);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private static StackPane createView(String text) {
        StackPane layout = new StackPane(new Label(text));
        layout.setPrefSize(400, 180);
        layout.setAlignment(Pos.CENTER);
        return layout;

    }

    private static StackPane addingJoke(ArrayList<String[]> listOfJokes) {

        VBox jokeAddingLayout = new VBox(10);

        TextField addedJoke = new TextField();
        TextField addedAnswer = new TextField();
        TextField addedExplanation = new TextField();
        GridPane addingJokeGridPane = new GridPane();
        Button uploadJoke = new Button("Add to list");
        Label jokeAddedMessage = new Label("");

        addingJokeGridPane.add(new Label("Joke:"), 0, 0);
        addingJokeGridPane.add(new Label("Answer:"), 0, 1);
        addingJokeGridPane.add(new Label("Explanation:"), 0, 2);
        addingJokeGridPane.add(addedJoke, 1, 0);
        addingJokeGridPane.add(addedAnswer, 1, 1);
        addingJokeGridPane.add(addedExplanation, 1, 2);
        addingJokeGridPane.setAlignment(Pos.CENTER);

        jokeAddingLayout.getChildren().addAll(addingJokeGridPane, uploadJoke, jokeAddedMessage);
        jokeAddingLayout.setAlignment(Pos.CENTER);

        uploadJoke.setOnAction((event) -> {
            String[] newJoke = { addedJoke.getText(), addedAnswer.getText(), addedExplanation.getText() };
            listOfJokes.add(newJoke);
            jokeAddedMessage.setText("Joke added successfully!");
        });

        StackPane layout = new StackPane(jokeAddingLayout);
        layout.setPrefSize(400, 180);
        layout.setAlignment(Pos.CENTER);
        return layout;
    }

}
