import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> listOfSuitcases;

    public Hold(int maxCapacity) {
        this.maximumWeight = maxCapacity;
        this.listOfSuitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maximumWeight - this.totalWeight() >= suitcase.totalWeight()) {
            this.listOfSuitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        if (this.listOfSuitcases.isEmpty()) {
            return currentWeight;
        }
        for (Suitcase suitcase : listOfSuitcases) {
            currentWeight += suitcase.totalWeight();
        }
        return currentWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : listOfSuitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return this.listOfSuitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
