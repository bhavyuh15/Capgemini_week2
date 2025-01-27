package onlinefooddeliverysystem;

// Abstract Class
// Represents a generic food item in the system
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    // Initializes the common properties of a food item
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract Method
    // Each subclass must implement its own logic to calculate the total price
    public abstract double calculateTotalPrice();

    // Concrete Method
    // Provides details of the food item
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Encapsulation - Getter Methods
    // Accessor methods to retrieve private properties
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
