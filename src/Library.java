import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Student> students; // NEW

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>(); // initialize students
        loadBooks();
        loadStudents(); // NEW
    }

    // Book management (unchanged)
    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

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

    // Student management - ADD STUDENT
    public void addStudent(Student student) {
        students.add(student);
        saveStudents();
    }

    // Student management - VIEW STUDENTS
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }
        System.out.println("Student ID | Name");
        for (Student s : students) {
            System.out.println(s.getId() + " | " + s.getName());
        }
    }

    // ===== Persistence for students =====
    private void saveStudents() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("students.txt"));
            for (Student s : students) {
                writer.println(s.getId() + "," + s.getName());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    private void loadStudents() {
        students.clear();
        try {
            File file = new File("students.txt");
            if (!file.exists()) return;

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    students.add(new Student(id, name));
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
    }

    // ===== Book persistence methods (unchanged) =====
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