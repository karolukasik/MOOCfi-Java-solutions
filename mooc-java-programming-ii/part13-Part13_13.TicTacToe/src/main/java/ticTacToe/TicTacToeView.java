package ticTacToe;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class TicTacToeView {
    private TicTacToeLogic game;
    private Label turnInformationLabel;

    public TicTacToeView(TicTacToeLogic game) {
        this.game = game;
        this.turnInformationLabel = new Label();
    }

    public Parent getView() {
        BorderPane layout = new BorderPane();

        turnInformationLabel.setText("Turn: " + this.game.getCurrentTurn());
        turnInformationLabel.setFont(Font.font("Monospaced", 20));
        GridPane board = new GridPane();

        Button btn00 = new Button();
        btn00.setFont(Font.font("Monospaced", 40));
        Button btn01 = new Button();
        btn01.setFont(Font.font("Monospaced", 40));
        Button btn02 = new Button();
        btn02.setFont(Font.font("Monospaced", 40));
        Button btn10 = new Button();
        btn10.setFont(Font.font("Monospaced", 40));
        Button btn11 = new Button();
        btn11.setFont(Font.font("Monospaced", 40));
        Button btn12 = new Button();
        btn12.setFont(Font.font("Monospaced", 40));
        Button btn20 = new Button();
        btn20.setFont(Font.font("Monospaced", 40));
        Button btn21 = new Button();
        btn21.setFont(Font.font("Monospaced", 40));
        Button btn22 = new Button();
        btn22.setFont(Font.font("Monospaced", 40));

        Button resetButton = new Button("Reset");

        btn00.setPrefSize(80, 80);
        btn01.setPrefSize(80, 80);
        btn02.setPrefSize(80, 80);
        btn10.setPrefSize(80, 80);
        btn11.setPrefSize(80, 80);
        btn12.setPrefSize(80, 80);
        btn20.setPrefSize(80, 80);
        btn21.setPrefSize(80, 80);
        btn22.setPrefSize(80, 80);

        board.add(btn00, 0, 0);
        board.add(btn01, 0, 1);
        board.add(btn02, 0, 2);
        board.add(btn10, 1, 0);
        board.add(btn11, 1, 1);
        board.add(btn12, 1, 2);
        board.add(btn20, 2, 0);
        board.add(btn21, 2, 1);
        board.add(btn22, 2, 2);
        board.setPadding(new Insets(5));
        board.setVgap(10);
        board.setHgap(10);
        board.setAlignment(Pos.CENTER);

        btn00.setOnAction((event) -> {
            buttonClickHandler(btn00, 0, 0);
        });
        btn01.setOnAction((event) -> {
            buttonClickHandler(btn01, 0, 1);
        });
        btn02.setOnAction((event) -> {
            buttonClickHandler(btn02, 0, 2);
        });
        btn10.setOnAction((event) -> {
            buttonClickHandler(btn10, 1, 0);
        });
        btn11.setOnAction((event) -> {
            buttonClickHandler(btn11, 1, 1);
        });
        btn12.setOnAction((event) -> {
            buttonClickHandler(btn12, 1, 2);
        });
        btn20.setOnAction((event) -> {
            buttonClickHandler(btn20, 2, 0);
        });
        btn21.setOnAction((event) -> {
            buttonClickHandler(btn21, 2, 1);
        });
        btn22.setOnAction((event) -> {
            buttonClickHandler(btn22, 2, 2);
        });

        resetButton.setOnMouseClicked((event) -> {
            this.game = new TicTacToeLogic();

            btn00.setText("");
            btn01.setText("");
            btn02.setText("");
            btn10.setText("");
            btn11.setText("");
            btn12.setText("");
            btn20.setText("");
            btn21.setText("");
            btn22.setText("");
            turnInformationLabel.setText("Turn: " + this.game.getCurrentTurn());
        });

        layout.setTop(turnInformationLabel);
        layout.setCenter(board);
        layout.setBottom(resetButton);
        layout.setPadding(new Insets(10));
        BorderPane.setAlignment(turnInformationLabel, Pos.CENTER);

        return layout;
    }

    private void buttonClickHandler(Button button, int column, int row) {
        if (game.positionIsEmpty(column, row) && game.isEnded() == false) {
            button.setText(game.putSymbol(column, row));
            game.changeCurrentTurn();
            if (game.isWon(column, row) || game.isFull()) {
                turnInformationLabel.setText(("The end!"));
                return;
            }
            turnInformationLabel.setText(("Turn: " + game.getCurrentTurn()));
        }
    }
}
