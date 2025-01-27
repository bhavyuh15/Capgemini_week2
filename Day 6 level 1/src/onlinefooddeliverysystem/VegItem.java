package onlinefooddeliverysystem;

// VegItem Class
// Represents vegetarian food items and provides discounting logic
public class VegItem extends FoodItem implements Discountable {
    private double discountAmount;

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountAmount = 0; // Initialize discount amount to zero
    }

    // Calculate the total price after applying the discount
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discountAmount;
    }

    // Apply a percentage discount to the total price
    @Override
    public void applyDiscount(double discountRate) {
        discountAmount = (getPrice() * getQuantity()) * (discountRate / 100);
    }

    // Provide details of the applied discount
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountAmount;
    }
}
