import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        int usedCapacity = 0;
        for (Item thing : items) {
            usedCapacity += thing.getWeight();
        }
        if (item.getWeight() <= (this.capacity - usedCapacity)) {
            this.items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }

    // @Override
    // public String toString() {
    // return this.items.toString();
    // }
}
