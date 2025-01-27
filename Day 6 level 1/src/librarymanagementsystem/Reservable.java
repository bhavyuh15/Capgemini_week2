package librarymanagementsystem;

// Interface Reservable
public interface Reservable {
    void reserveItem(String borrowerName);  // Method to reserve an item
    boolean checkAvailability();           // Method to check if the item is available
}
