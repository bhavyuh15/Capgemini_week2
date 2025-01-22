import java.util.ArrayList;
import java.util.List;

// Book Class
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display Book Information
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library Class
class Library {
    String name;
    List<Book> books; // Aggregation: A Library has multiple Books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

// Main Class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The looser", "Survesh");
        Book book2 = new Book("checkmate ", "Pradeep");
        Book book3 = new Book("Blunder", "Bhavya");

        // Create libraries
        Library library1 = new Library("central library");
        Library library2 = new Library("University Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Shared book
        library2.addBook(book3);

        // Display books in each library
        library1.showBooks();
        library2.showBooks();
    }
}
