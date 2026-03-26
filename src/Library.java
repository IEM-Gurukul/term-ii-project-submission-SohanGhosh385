import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        loadBooks(); // Load books from file at startup
    }

    // Add book and save to file
    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    // View all books
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

    // Save books to file
    private void saveBooks() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("books.txt"));
            for (Book b : books) {
                writer.println(b.getId() + "," + b.getTitle() + "," + b.getAuthor() + "," + b.getQuantity());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    // Load books from file
    private void loadBooks() {
        books.clear();
        try {
            File file = new File("books.txt");
            if (!file.exists()) return;

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String title = parts[1];
                    String author = parts[2];
                    int quantity = Integer.parseInt(parts[3]);
                    books.add(new Book(id, title, author, quantity));
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error loading books: " + e.getMessage());
        }
    }
}