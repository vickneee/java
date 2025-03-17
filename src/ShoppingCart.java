import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Cart!");

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '€';
        double total;

        System.out.println("Please enter the item you would like to purchase: ");
        item = scanner.nextLine();

        System.out.println("Please enter the price you would like to purchase: ");
        price = scanner.nextDouble();

        System.out.println("Please enter the quantity you would like to purchase: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Your item is: " + item);
        System.out.println("Your price is: " + currency + price);
        System.out.println("Your quantity is: " + quantity);
        System.out.println("Your total is: " + total);

        scanner.close();
    }
}
