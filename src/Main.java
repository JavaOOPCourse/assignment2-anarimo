import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(2);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.println("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.println("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.println("Введите год книги: ");
                    int year = scanner.nextInt(); scanner.nextLine();
                    Book b = new Book(title, author, year);
                    library.addBook(b);
                    break;
                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("Введите название книги: ");
                    String titleE = scanner.nextLine();
                    System.out.println("Введите автора книги: ");
                    String authorE = scanner.nextLine();
                    System.out.println("Введите год книги: ");
                    int yearE = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите размер электронной книги: ");
                    double fileSize = scanner.nextDouble();
                    EBook b2 = new EBook(titleE, authorE, yearE, fileSize);
                    library.addBook(b2);
                    break;
                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("Введите название книги: ");
                    String name = scanner.nextLine();
                    library.searchByTitle(name);
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("Введите назание книги которую хотите взять: ");
                    String nameR = scanner.nextLine();
                    library.borrowBook(nameR);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.println("Введите назание книги которую хотите вернуть: ");
                    String booktitle = scanner.nextLine();
                    library.returnBook(booktitle);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
