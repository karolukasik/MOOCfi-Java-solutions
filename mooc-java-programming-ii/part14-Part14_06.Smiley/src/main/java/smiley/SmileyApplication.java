package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane layout = new BorderPane();
        int widthOfCanvas = 700;
        Canvas paintingCanvas = new Canvas(widthOfCanvas, widthOfCanvas);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        painter.setFill(Color.WHITE);
        painter.fillRect(0, 0, widthOfCanvas, widthOfCanvas);

        int rectangleSize = widthOfCanvas / 8;

        int xStartPositionOfLeftEye = rectangleSize * 2 + 1;
        int yStartPositionOfLeftEye = rectangleSize * 1 + 1;
        int xStartPositionOfRightEye = rectangleSize * 5 + 1;
        int yStartPositionOfRightEye = rectangleSize * 1 + 1;
        int xStartPositionOfLeftUpperSmile = rectangleSize * 1 + 1;
        int yStartPositionOfLeftUpperSmile = rectangleSize * 4 + 1;
        int xStartPositionOfrightUpperSmile = rectangleSize * 6 + 1;
        int yStartPositionOfRightUpperSmile = rectangleSize * 4 + 1;
        int xStartPositionOfBottomSmile = rectangleSize * 2 + 1;
        int yStartPositionOfBottomSmile = rectangleSize * 5 + 1;

        painter.setFill(Color.BLACK);

        painter.fillRect(xStartPositionOfLeftEye, yStartPositionOfLeftEye, rectangleSize, rectangleSize);
        painter.fillRect(xStartPositionOfRightEye, yStartPositionOfRightEye, rectangleSize, rectangleSize);
        painter.fillRect(xStartPositionOfLeftUpperSmile, yStartPositionOfLeftUpperSmile, rectangleSize, rectangleSize);
        painter.fillRect(xStartPositionOfrightUpperSmile, yStartPositionOfRightUpperSmile, rectangleSize,
                rectangleSize);
        painter.fillRect(xStartPositionOfBottomSmile, yStartPositionOfBottomSmile, rectangleSize * 4, rectangleSize);

        layout.setCenter(paintingCanvas);

        Scene view = new Scene(layout);
        primaryStage.setScene(view);
        primaryStage.show();
    }

}
