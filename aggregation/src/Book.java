public class Book {

    // Variables
    String title;
    int pages;

    // Constructor
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println(title + " - " + pages + " pages");
    }

    // toString() method
    public String toString() {
        return title + " - " + pages + " pages";
    }
}
