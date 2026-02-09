public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public Book(Book other) {
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.year = other.getYear();
        this.isAvailable = other.isAvailable();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        if (isAvailable()){
            this.isAvailable = false;
            System.out.println("Вы взяли книгу");
        } else {
            System.out.println("Книга занята, вы не можете ее взять");
        }
    }

    // TODO: Implement return logic
    public void returnBook() {
        if (!isAvailable()){
            this.isAvailable = true;
            System.out.println("Вы вернули книгу");
        } else {
            System.out.println("Эту книгу никто не брал!");
        }
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return ("Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year + "\nAvailable: " + this.isAvailable);
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
//        if(this == obj)  {return true;}
        if(!(obj instanceof Book)) {return false;}
        Book other = (Book) obj;
        if (this.title.equalsIgnoreCase(other.getTitle()) && this.author.equals(other.getAuthor()) && this.year == other.getYear()){
            return true;
        } else {
            return false;
        }
    }
}
