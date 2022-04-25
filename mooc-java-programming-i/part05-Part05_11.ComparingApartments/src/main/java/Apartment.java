
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int difference = this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares;
        if (difference < 0) {
            return -1 * difference;

        } else {
            return difference;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int difference = this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares;
        if (difference > 0) {
            return true;
        } else {
            return false;
        }

    }

    public int getSquares() {
        return squares;
    }

    public int getRooms() {
        return rooms;
    }

    public int getPrincePerSquare() {
        return pricePerSquare;
    }

}
