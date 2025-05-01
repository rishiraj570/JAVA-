package experiment9_2;
import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add products
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);

        // Update quantity of product 102
        inventory.put(102, 35);

        // Remove product 103
        inventory.remove(103);

        // Display inventory
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
