package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TicTacToeLogic game = new TicTacToeLogic();
        TicTacToeView gameView = new TicTacToeView(game);
        Scene view = new Scene(gameView.getView());

        window.setTitle("TicTacToe");
        window.setScene(view);
        window.show();
    }

}
