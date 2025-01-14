package Food_delivery_system;
import java.util.ArrayList;
import java.util.List;
public class User {
    private int userId;
    private String name;
    private List<Food_delivery_system.Order> orderHistory;
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }
    public void placeOrder(Food_delivery_system.Order order) {
        orderHistory.add(order);
    }
    public void viewOrderHistory() {
        for (Food_delivery_system.Order order : orderHistory) {
            System.out.println("Order ID: " + order.orderId + ", Status: " + order.getStatus() + ", Total: " + order.calculateTotal());
            for (Food_delivery_system.MenuItem item : order.getItems()) {
                System.out.println(" - " + item.getDetails());
            }
        }
    }
}