package librarymanagementsystem;

// Subclass Book
public class Book extends LibraryItem implements Reservable {
    private boolean isReserved;   // Flag to check if the book is reserved
    private String borrowerName;  // Name of the person who reserved the book

    // Constructor to initialize book details
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false; // Initially, the book is not reserved
    }

    @Override
    public int getLoanDuration() {
        return 21; // Loan duration is 21 days for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrowerName = borrowerName;
            System.out.println("Book reserved for: " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved; // Returns true if the book is not reserved
    }
}
