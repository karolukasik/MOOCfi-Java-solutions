import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> itemsList;
    private int itemsCount;

    public Box(double capacity) {
        this.capacity = capacity;
        this.itemsList = new ArrayList<Packable>();
        this.itemsCount = 0;
    }

    public void add(Packable item) {
        if (isEnoughPlace(item)) {
            this.itemsList.add(item);
        }
    }

    public boolean isEnoughPlace(Packable item) {
        return (this.capacity - weight()) > item.weight();
    }

    public double weight() {
        double weight = 0;
        for (Packable item : itemsList) {
            weight += item.weight();
        }
        return weight;
    }

    public int numberOfItems() {
        return this.itemsList.size();
    }

    @Override
    public String toString() {
        if (this.itemsCount == 1) {
            return "Box: " + this.numberOfItems() + " item, total weight " + this.weight() + " kg";
        }
        return "Box: " + this.numberOfItems() + " items, total weight " + this.weight() + " kg";
    }

}
