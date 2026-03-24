import java.util.ArrayList;

public class Library {

    // List to store books
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library (method skeleton for now)
    public void addBook(Book book) {
        books.add(book);
    }

    // View books in the library (method skeleton for now)
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("Book ID | Title | Author | Quantity");
        for (Book b : books) {
            System.out.println(b.getId() + " | " + b.getTitle() + " | " + b.getAuthor() + " | " + b.getQuantity());
        }
    }
}