package Food_delivery_system;
import java.util.ArrayList;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        Food_delivery_system.Resturant restaurant = new Food_delivery_system.Resturant();
        // MENU
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Chicken");
        ingredients.add("Spices");
        FoodItem Soap = new FoodItem("Soap", 1.99f, "Fresh drink", ingredients);
        DrinkItem Coca = new DrinkItem("Soda", 0.99f, "Refreshing soft drink", "Medium");
        // ADD TO MENU
        restaurant.addToMenu(Soap);
        restaurant.addToMenu(Coca);
        // DISPLAY MENU
        System.out.println("Menu:");
        restaurant.viewMenu();
        // USER ORDER
        User user = new User(1, "John Doe");
        Order order = new Order(101);
        order.addItem(Soap);
        order.addItem(Coca);
        user.placeOrder(order);
        // Process the order
        restaurant.processOrder(order);
        // View order history
        System.out.println("\nOrder History:");
        user.viewOrderHistory();
    }
}
