public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Default constructor
        Book book1 = new Book();
        book1.displayInfo();

        // Parameterized constructor
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book2.displayInfo();
    }
}
