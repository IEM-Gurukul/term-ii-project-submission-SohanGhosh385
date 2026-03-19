import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    Book book = new Book(id, title, author, quantity);
                    library.addBook(book);

                    break;

                case 2:

                    library.viewBooks();
                    break;

                case 3:

                    System.out.println("Exiting system...");
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}