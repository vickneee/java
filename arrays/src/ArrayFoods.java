import java.util.Scanner;
import java.util.Arrays;

public class ArrayFoods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods = new String[3];

        // foods[0] = "rice";
        // foods[1] = "beans";
        // foods[2] = "potato";

        int numOfFoods = foods.length;
        System.out.println(numOfFoods);
        // Arrays.sort(foods); // Sorts the array in ascending order
        // System.out.println(Arrays.toString(foods)); // [beans, potato, rice]

        // For loop
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter food: ");
            foods[i] = scanner.nextLine();
        }

        // Enhanced for loop
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
