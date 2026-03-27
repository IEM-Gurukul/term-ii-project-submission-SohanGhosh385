import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Student> students;
    private ArrayList<IssueRecord> issuedRecords; // NEW

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
        issuedRecords = new ArrayList<>(); // initialize issued records
        loadBooks();
        loadStudents();
        loadIssuedRecords(); // NEW
    }

    // ===== Existing methods: add/view books and students =====

    // ===== Issue Book =====
    public void issueBook(int studentId, int bookId) {
        // Check if student exists
        Student student = null;
        for (Student s : students) {
            if (s.getId() == studentId) {
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        // Check if book exists and available
        Book book = null;
        for (Book b : books) {
            if (b.getId() == bookId) {
                book = b;
                break;
            }
        }
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.getQuantity() <= 0) {
            System.out.println("Book not available for issuing!");
            return;
        }

        // Reduce quantity and record issuance
        book.setQuantity(book.getQuantity() - 1);
        IssueRecord record = new IssueRecord(studentId, bookId);
        issuedRecords.add(record);
        saveBooks();
        saveIssuedRecords();
        System.out.println("Book issued successfully to " + student.getName());
    }

    // ===== Persistence for issued records =====
    private void saveIssuedRecords() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("issued.txt"));
            for (IssueRecord r : issuedRecords) {
                writer.println(r.getStudentId() + "," + r.getBookId());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving issued records: " + e.getMessage());
        }
    }

    private void loadIssuedRecords() {
        issuedRecords.clear();
        try {
            File file = new File("issued.txt");
            if (!file.exists()) return;

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    int sid = Integer.parseInt(parts[0]);
                    int bid = Integer.parseInt(parts[1]);
                    issuedRecords.add(new IssueRecord(sid, bid));
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error loading issued records: " + e.getMessage());
        }
    }
}