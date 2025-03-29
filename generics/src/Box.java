public class Box<T> {

    // Generic variable
    private T item;

    // Constructor
    public Box(T item) {
        this.item = item;
    }

    // Setter
    public void setItem(T item) {
        this.item = item;
    }

    // Getter
    public T getItem() {
        return item;
    }

    // Main method
    public static void main(String[] args) {

        // Box = A class that can hold a single value of any type
        //       (Box<T>, Box<String>, Box<Integer>, etc.)
        //       (Box<String> box = new Box<>("Hello");)
        //       (Box<Integer> box = new Box<>(123);)

        // Example: Box<String>
        Box<String> stringBox = new Box<>("Hello");
        System.out.println("String Box: " + stringBox.getItem());

        stringBox.setItem("World");
        System.out.println("Updated String Box: " + stringBox.getItem());

        // Example: Box<Integer>
        Box<Integer> integerBox = new Box<>(123);
        System.out.println("Integer Box: " + integerBox.getItem());

        integerBox.setItem(456);
        System.out.println("Updated Integer Box: " + integerBox.getItem());

    }
}
