package ticTacToe;

public class TicTacToeLogic {
    private String[][] board;
    private String currentTurn;
    private boolean isEnded;

    public TicTacToeLogic() {
        this.isEnded = false;
        this.currentTurn = "X";
        this.board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                this.board[i][j] = "";
            }
        }
    }

    public String getCurrentTurn() {
        return currentTurn;
    }

    public String[][] getBoard() {
        return board;
    }

    public void changeCurrentTurn() {
        if (this.currentTurn.equals("X")) {
            this.currentTurn = "O";
        } else {
            this.currentTurn = "X";
        }
    }

    public String putSymbol(int column, int row) {
        this.board[column][row] = this.currentTurn;
        if (this.isWon(column, row) || this.isFull()) {
            this.isEnded = true;
            return this.board[column][row];
        }
        return this.currentTurn;
    }

    public boolean isEnded() {
        return this.isEnded;
    }

    public boolean positionIsEmpty(int column, int row) {
        return this.board[column][row].equals("");
    }

    public boolean isWon(int column, int row) {
        int[][] columnCoordinates = { { column, 0 }, { column, 1 }, { column, 2 } };
        int[][] rowCoordinates = { { 0, row }, { 1, row }, { 2, row } };
        int[][] firstDiagonalCoordinates = { { 0, 0 }, { 1, 1 }, { 2, 2 } };
        int[][] secondDiagonalCoordinates = { { 0, 2 }, { 1, 1 }, { 2, 0 } };
        if (symbolsAreTheSame(columnCoordinates) || symbolsAreTheSame(rowCoordinates)
                || symbolsAreTheSame(firstDiagonalCoordinates) || symbolsAreTheSame(secondDiagonalCoordinates)) {
            return true;
        }

        return false;
    }

    private boolean symbolsAreTheSame(int[][] coordinates) {
        int[] a = coordinates[0];
        int[] b = coordinates[1];
        int[] c = coordinates[2];
        String fieldA = this.board[a[0]][a[1]];
        String fieldB = this.board[b[0]][b[1]];
        String fieldC = this.board[c[0]][c[1]];

        if (!fieldA.equals("") &&
                fieldA.equals(fieldB)
                && fieldA.equals(fieldC)) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (positionIsEmpty(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
