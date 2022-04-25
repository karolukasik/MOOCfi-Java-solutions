public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory balanceHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.balanceHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.balanceHistory.add(initialBalance);
    }

    public String history() {
        return this.balanceHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        balanceHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        balanceHistory.add(super.getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.balanceHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.balanceHistory.minValue());
        System.out.println("Average: " + this.balanceHistory.average());
    }
}
