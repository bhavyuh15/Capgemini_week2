public class Book {
    private String title;
    private String author;
    private double price;
    private int availability;

    // Constructor to initialize the book's details
    public Book(String title, String author, double price, int availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    public void borrow() {
        if (availability > 0) {
            availability--;
            System.out.println("You have successfully borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }

    // Method to return the book
    public void returnBook() {
        availability++;
        System.out.println("Thank you for returning '" + title + "'.");
    }

    // Getter methods for the attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 3);
        book1.borrow();  // Borrowing the book
        book1.borrow();  // Borrowing again
        book1.returnBook();  // Returning the book
        book1.borrow();  // Borrowing after return
    }
}
