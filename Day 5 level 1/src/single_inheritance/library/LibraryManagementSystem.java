package single_inheritance.library;

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create an instance of single_inheritance.library.Author
        Author author = new Author("RCB", 2008, "Virat", "E sala cup namdu");

        // Display book and author details
        System.out.println("--- single_inheritance.library.Book and single_inheritance.library.Author Details ---");
        author.displayInfo();
    }
}
