import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> listOfReceivables;

    public IOU() {
        this.listOfReceivables = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.listOfReceivables.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.listOfReceivables.getOrDefault(toWhom, 0.0);
    }
}
