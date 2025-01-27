package onlinefooddeliverysystem;

// Interface
// Defines the behavior for applying discounts to food items
public interface Discountable {
    void applyDiscount(double discountRate); // Apply discount as a percentage
    String getDiscountDetails(); // Provide details about the applied discount
}
