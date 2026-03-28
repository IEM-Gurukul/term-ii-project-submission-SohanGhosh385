import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Student");
            System.out.println("4. View Students");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1: // Add Book
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(id, title, author, quantity);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2: // View Books
                    library.viewBooks();
                    break;

                case 3: // Add Student
                    System.out.print("Enter Student ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String sname = scanner.nextLine();

                    Student student = new Student(sid, sname);
                    library.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;

                case 4: // View Students
                    library.viewStudents();
                    break;

                case 5: // Issue Book
                    System.out.print("Enter Student ID: ");
                    int issueSid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book ID: ");
                    int issueBid = scanner.nextInt();
                    scanner.nextLine();

                    library.issueBook(issueSid, issueBid);
                    break;

                case 6: // Return Book
                    System.out.print("Enter Student ID: ");
                    int returnSid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book ID: ");
                    int returnBid = scanner.nextInt();
                    scanner.nextLine();

                    library.returnBook(returnSid, returnBid);
                    break;

                case 7: // Exit
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        scanner.close();
    }
}