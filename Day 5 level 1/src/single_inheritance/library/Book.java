package single_inheritance.library;

class Book {
    String title;
    int publicationYear;

    // Constructor for single_inheritance.library.Book
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("single_inheritance.library.Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

