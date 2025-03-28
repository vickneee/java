public class Library {

    // Variables
    String name;
    int year;
    Book[] books;

    // Constructor
    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public void displayInfo() {
        System.out.println("Library: " + this.name + " " + this.year);
        System.out.println("Books Available: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
