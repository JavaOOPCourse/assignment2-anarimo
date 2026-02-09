public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count <books.length){
            books[count] = book;
            System.out.println("Книга добавлена!");
            count++;
        } else {
            System.out.println("Библиотека полна!");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        for (Book b: books){
            System.out.println(b.toString());
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (Book b:books){
            if (b != null && b.getTitle().equals(title)){
                return b;
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book foundBook = searchByTitle(title);

        if (foundBook != null){
            if (foundBook.isAvailable()){
                foundBook.borrowBook();
            }
        } else {
            System.out.println("Книги '" + title + "' нет в нашей библиотеке.");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        // implement
    }
}
