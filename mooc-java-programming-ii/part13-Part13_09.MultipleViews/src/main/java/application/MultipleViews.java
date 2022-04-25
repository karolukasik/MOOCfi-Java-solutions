package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {

        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        // first scene nodes
        Label firstPageLabel = new Label("First view!");
        Button toSecondScene = new Button("To the second view!");
        BorderPane firstPageBorderPane = new BorderPane(toSecondScene, firstPageLabel, null, null, null);

        // second scene nodes
        Button toThirdScene = new Button("To the third view!");
        Label secondPageLabel = new Label("Second view!");
        VBox secondPageVbox = new VBox(10, toThirdScene, secondPageLabel);

        // third scene nodes
        Button toFirstScene = new Button("To the first view!");
        Label thirdPageLabel = new Label("Third view!");
        GridPane thirdPageGridPane = new GridPane();
        thirdPageGridPane.add(thirdPageLabel, 0, 0);
        thirdPageGridPane.add(toFirstScene, 1, 1);

        Scene firstScene = new Scene(firstPageBorderPane);
        Scene secondScene = new Scene(secondPageVbox);
        Scene thirdScene = new Scene(thirdPageGridPane);

        toFirstScene.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                window.setScene(firstScene);
                setWindowSize(window);
            }
        });

        toSecondScene.setOnAction((event) -> {
            window.setScene(secondScene);
            setWindowSize(window);
        });
        toThirdScene.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                window.setScene(thirdScene);
                setWindowSize(window);
            }
        });

        window.setScene(firstScene);
        setWindowSize(window);
        window.show();
    }

    public static void setWindowSize(Stage window) {
        window.setHeight(200);
        window.setWidth(200);
    }

}
