public class Product<T, U> {

    // Encapsulated Generic variables
    private T name;
    private U price;

    // Constructor
    public Product(T name, U price) {
        this.name = name;
        this.price = price;
    }

    // Setters
    public void setName(T name) {
        this.name = name;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    // Getters
    public T getName() {
        return name;
    }

    public U getPrice() {
        return price;
    }

    // Main method
    public static void main(String[] args) {

        // Example: Product<String, Double>
        Product<String, Double> product1 = new Product<>("Laptop", 999.99);
        System.out.println("Product 1: " + product1.getName() + " - €" + product1.getPrice());

        // Example: Product<String, String>
        Product<String, String> product3 = new Product<>("Tablet", "299.99");
        System.out.println("Product 3: " + product3.getName() + " - €" + product3.getPrice());

        // Example: Product<String, Integer>
        Product<String, Integer> product2 = new Product<>("Phone", 799);
        System.out.println("Product 2: " + product2.getName() + " - €" + product2.getPrice());
    }
}
