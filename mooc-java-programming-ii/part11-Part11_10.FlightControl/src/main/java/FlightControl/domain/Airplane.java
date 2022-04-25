package FlightControl.domain;

public class Airplane {
    private String ID;
    private int capacity;

    public Airplane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return this.ID + " (" + this.capacity + " capacity)";
    }
}
