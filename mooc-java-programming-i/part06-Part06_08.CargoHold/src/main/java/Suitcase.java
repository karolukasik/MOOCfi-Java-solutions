import java.util.ArrayList;

public class Suitcase {
    private int maxCapacity;
    private ArrayList<Item> listOfItems;

    public Suitcase(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.listOfItems = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : listOfItems) {
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (this.maxCapacity - this.totalWeight() >= item.getWeight()) {
            this.listOfItems.add(item);
        }
    }

    public void printItems() {
        for (Item item : listOfItems) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.listOfItems.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.listOfItems.get(0);
        for (Item item : listOfItems) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (this.listOfItems.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.listOfItems.size() == 1) {
            return "1 item (" + this.listOfItems.get(0).getWeight() + " kg)";
        }
        return this.listOfItems.size() + " items (" + this.totalWeight() + " kg)";
    }
}
