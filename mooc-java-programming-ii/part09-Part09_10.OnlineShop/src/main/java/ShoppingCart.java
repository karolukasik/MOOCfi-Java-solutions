import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> listOfProducts;

    public ShoppingCart() {
        this.listOfProducts = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.listOfProducts.containsKey(product)) {
            this.listOfProducts.get(product).increaseQuantity();
        } else {
            this.listOfProducts.put(product, new Item(product, price));
        }
    }

    public int price() {
        int price = 0;
        for (Item item : this.listOfProducts.values()) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : this.listOfProducts.values()) {
            System.out.println(item);
        }
    }

}
