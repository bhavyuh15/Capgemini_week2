package onlinefooddeliverysystem;

// NonVegItem Class
// Represents non-vegetarian food items with an additional charge and discounting logic
public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge; // Extra charge for non-vegetarian items
    private double discountAmount;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discountAmount = 0; // Initialize discount amount to zero
    }

    // Calculate the total price after including the additional charge and discount
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + additionalCharge) - discountAmount;
    }

    // Apply a percentage discount to the total price
    @Override
    public void applyDiscount(double discountRate) {
        discountAmount = (getPrice() * getQuantity() + additionalCharge) * (discountRate / 100);
    }

    // Provide details of the applied discount
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountAmount;
    }
}
