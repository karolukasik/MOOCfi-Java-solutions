import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> listOfProducts;
    private Map<String, Integer> stockList;

    public Warehouse() {
        this.listOfProducts = new HashMap<>();
        this.stockList = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.listOfProducts.put(product, price);
        this.stockList.put(product, stock);
    }

    public int price(String product) {
        if (listOfProducts.containsKey(product)) {
            return listOfProducts.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.listOfProducts.containsKey(product)) {
            return this.stockList.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (!(this.listOfProducts.containsKey(product))) {
            return false;
        }

        if (this.stockList.get(product) == 0) {
            return false;
        }
        int stockValue = this.stockList.get(product);
        this.stockList.put(product, stockValue - 1);
        return true;
    }

    public Set<String> products() {
        return this.listOfProducts.keySet();
    }
}
