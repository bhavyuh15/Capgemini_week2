package librarymanagementsystem;

// Subclass DVD
public class DVD extends LibraryItem implements Reservable {
    private boolean isReserved; // Flag to check if the DVD is reserved

    // Constructor to initialize DVD details
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false; // Initially, the DVD is not reserved
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration is 14 days for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.isReserved = true;
            System.out.println("DVD reserved for: " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved; // Returns true if the DVD is not reserved
    }
}
