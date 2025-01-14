package Food_delivery_system;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public int orderId;
    private int newId;
    private List<Food_delivery_system.MenuItem> items;
    private String status;
    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.status = "Pending";
    }

    public void addItem(Food_delivery_system.MenuItem menuItem) {
        items.add(menuItem);
    }

    public void removeItem(Food_delivery_system.MenuItem menuItem) {
        items.remove(menuItem);
    }

    public float calculateTotal() {
        float total = 0;
        for (Food_delivery_system.MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }

    public List<Food_delivery_system.MenuItem> getItems() {
        return items;
    }
}
