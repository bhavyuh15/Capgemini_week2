package librarymanagementsystem;

// Abstract class LibraryItem
public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor to initialize library item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to get the loan duration (to be implemented by subclasses)
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}
