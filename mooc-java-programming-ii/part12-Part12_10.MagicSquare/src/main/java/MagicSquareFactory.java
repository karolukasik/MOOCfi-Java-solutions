
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int middleColumnIndex = (size / 2);
        int squareCapacity = size * size;
        int rowIndex = 0;
        int columnIndex = middleColumnIndex;
        int[] nextIndexes = { rowIndex, columnIndex };
        for (int number = 1; number <= squareCapacity; number++) {
            if (number == 1) {
                square.placeValue(nextIndexes[0], nextIndexes[1], number);
                continue;
            }
            nextIndexes = findCorrectIndex(nextIndexes[0], nextIndexes[1], square);
            square.placeValue(nextIndexes[0], nextIndexes[1], number);
        }

        return square;
    }

    private int[] findCorrectIndex(int x, int y, MagicSquare square) {
        int[] correctIndexes = { x, y };
        int size = square.getHeight();

        // find temporary indexes according to general law x-1, y+1;
        int temporaryX = correctIndexes[0] - 1;
        int temporaryY = correctIndexes[1] + 1;
        // check if they are in range of the square - if not, change to the range
        if (temporaryX < 0) {
            temporaryX = size - 1;
        }
        if (temporaryY > size - 1) {
            temporaryY = 0;
        }
        // check if in the range exist any value - if yes, correct the indexes, if not,
        // they are correct
        if (square.readValue(temporaryX, temporaryY) == 0) {
            correctIndexes[0] = temporaryX;
            correctIndexes[1] = temporaryY;
            return correctIndexes;
        } else {
            correctIndexes[0] = x + 1;
            return correctIndexes;
        }

    }

}
