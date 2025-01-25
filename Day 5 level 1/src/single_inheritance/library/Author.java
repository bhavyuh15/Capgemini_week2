package single_inheritance.library;

// Subclass: single_inheritance.library.Author
public class Author extends Book {
    String name;
    String bio;

    // Constructor for single_inheritance.library.Author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call to the superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo() to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("single_inheritance.library.Author Name: " + name);
        System.out.println("single_inheritance.library.Author Bio: " + bio);
    }
}
