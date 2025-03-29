import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        // Prompt the user to enter food items
        System.out.print("Enter the number of food items you want to enter: ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        // Loop to get food items from the user
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter food item " + (i + 1) + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        for ( int i = 0 ; i < numberOfItems; i++) {

        }

        // Print the list of food items
        System.out.println("You entered the following food items: " + foods);

        // Print each food item on a new line
        for (String food : foods) {
            System.out.println(food);
        }

//        // Prompt the user to enter food items
//        System.out.print("Enter food items (type 'done' to finish): ");
//
//        while (true) {
//            String food = scanner.nextLine();
//
//            // Check if the user wants to finish entering items
//            if (food.equalsIgnoreCase("done")) {
//                break;
//            }
//
//            // Add the food item to the ArrayList
//            foods.add(food);
//        }
//
//        // Print the list of food items
//        System.out.println("You entered the following food items:");
//        for (String food : foods) {
//            System.out.println(food);
//        }

        scanner.close();
    }
}
