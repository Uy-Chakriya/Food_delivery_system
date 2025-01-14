package Food_delivery_system;
import java.util.ArrayList;
import java.util.List;

public class Resturant {
    private List<Food_delivery_system.MenuItem> menu;
    private List<Food_delivery_system.Order> orders;

    public Resturant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addToMenu(Food_delivery_system.MenuItem item) {
        menu.add(item);
    }
    public void viewMenu() {
        for (Food_delivery_system.MenuItem item : menu) {
            System.out.println(item.getDetails());
        }
    }
    public void processOrder(Food_delivery_system.Order order) {
        if (orders.contains(order)) {
            order.updateStatus("Out for Delivery");
        } else {
            orders.add(order);
            order.updateStatus("Preparing");
        }
    }
}

