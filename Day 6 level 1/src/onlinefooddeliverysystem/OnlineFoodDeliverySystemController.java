package onlinefooddeliverysystem;

// Main Class to Test
// Demonstrates the functionality of the system
public class OnlineFoodDeliverySystemController {

    // Method to process orders for any type of FoodItem
    // Demonstrates polymorphism by using the parent class reference
    public static void processOrder(FoodItem item) {
        // Display basic item details
        System.out.println(item.getItemDetails());
        // Display the total price of the item
        System.out.println("Total Price: " + item.calculateTotalPrice());
        // Check if the item supports discounting and display discount details
        if (item instanceof Discountable) {
            System.out.println(((Discountable) item).getDiscountDetails());
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a vegetarian item
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 250, 2);
        // Create a non-vegetarian item with an additional charge
        FoodItem nonVegItem = new NonVegItem("Biryani", 350, 1, 50);

        // Apply discounts to both items
        ((Discountable) vegItem).applyDiscount(10); // Apply 10% discount
        ((Discountable) nonVegItem).applyDiscount(5); // Apply 5% discount

        // Process and display order details for the vegetarian item
        processOrder(vegItem);
        // Process and display order details for the non-vegetarian item
        processOrder(nonVegItem);
    }
}
