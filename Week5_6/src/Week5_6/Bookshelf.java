package Week5_6;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightYear;

    // Constructor
    public Book(String title, String author, String publisher, int copyrightYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightYear = copyrightYear;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    // toString method for formatted output
    @Override
    public String toString() {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Publisher: " + publisher + "\n" +
               "Copyright Year: " + copyrightYear + "\n";
    }
}

public class Bookshelf {
    public static void main(String[] args) {
        // Creating multiple Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925);

        // Displaying book details
        System.out.println("Books in the Bookshelf:");
        System.out.println("------------------------");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // Updating book2's publisher
        book2.setPublisher("Penguin Books");
        System.out.println("\nAfter updating book2's publisher:");
        System.out.println(book2);
    }
}