import java.util.*;
import java.io.*;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private final String FILE_NAME = "books.txt";

    public Library() {
        loadBooks();
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks();
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nLibrary Books:");

        for (Book b : books) {
            System.out.println(
                b.getId() + " | " +
                b.getTitle() + " | " +
                b.getAuthor() + " | Available: " +
                b.getQuantity()
            );
        }
    }

    private void saveBooks() {

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

            for (Book b : books) {
                writer.println(
                    b.getId() + "," +
                    b.getTitle() + "," +
                    b.getAuthor() + "," +
                    b.getQuantity()
                );
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving books.");
        }
    }

    private void loadBooks() {

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) return;

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                int quantity = Integer.parseInt(data[3]);

                books.add(new Book(id, title, author, quantity));
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error loading books.");
        }
    }
}