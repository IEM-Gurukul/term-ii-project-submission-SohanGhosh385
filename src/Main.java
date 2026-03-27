import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Student");  // NEW
            System.out.println("4. View Students"); // NEW
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    Book book = new Book(id, title, author, quantity);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3: // Add student
                    System.out.print("Enter Student ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = scanner.nextLine();
                    Student student = new Student(sid, sname);
                    library.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;

                case 4: // View students
                    library.viewStudents();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}