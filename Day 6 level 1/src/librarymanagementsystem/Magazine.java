package librarymanagementsystem;

// Subclass Magazine
public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved; // Flag to check if the magazine is reserved

    // Constructor to initialize magazine details
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false; // Initially, the magazine is not reserved
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration is 7 days for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.isReserved = true;
            System.out.println("Magazine reserved for: " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved; // Returns true if the magazine is not reserved
    }
}
