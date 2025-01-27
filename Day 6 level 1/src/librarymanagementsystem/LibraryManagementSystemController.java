package librarymanagementsystem;

// Main class to demonstrate functionality
public class LibraryManagementSystemController {
    public static void main(String[] args) {
        // Creating instances of library items
        LibraryItem book = new Book("B001", "The Gold", "Paulo");
        LibraryItem magazine = new Magazine("M001", "Time Travel", "Raju");
        LibraryItem dvd = new DVD("D001", "Tm", "Nolan");

        // Display details of all library items
        System.out.println(book.getItemDetails());
        System.out.println(magazine.getItemDetails());
        System.out.println(dvd.getItemDetails());

        // Reserve items and check their availability
        ((Reservable) book).reserveItem("Aman");
        System.out.println("Book available: " + ((Reservable) book).checkAvailability());

        ((Reservable) magazine).reserveItem("Pal");
        System.out.println("Magazine available: " + ((Reservable) magazine).checkAvailability());

        ((Reservable) dvd).reserveItem("Paul");
        System.out.println("DVD available: " + ((Reservable) dvd).checkAvailability());
    }
}
