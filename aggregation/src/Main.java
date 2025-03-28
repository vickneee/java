public class Main {

    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects (classes).
        //            = A more specific form of association.
        //            = It is a unidirectional association, meaning it is strictly a one-way relationship.
        //            = One object owns or is responsible for another object.
        //            = If the owning object is destroyed, the owned class can continue to exist independently.

        // Create book objects
        Book book1 = new Book("Harry Potter", 500);
        Book book2 = new Book("Lord of the Rings", 700);
        Book book3 = new Book("Java Programming", 300);

        // Books array
        Book[] books = {book1, book2, book3};

        // Aggregation
        Library library = new Library("Central Library", 1990, books);

        // Display library info
        library.displayInfo();

    }
}
