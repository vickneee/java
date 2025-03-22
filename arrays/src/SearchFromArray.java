import java.util.Scanner;

public class SearchFromArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana", "kiwi"};
        int[] numbers = {1, 2, 3, 4, 5};

        // Search for a fruit in the array
        String fruitToSearch;
        // Search for a number in the array
        int numberToSearch = 3;
        // Flag to check if the item is found
        boolean isFound = false;

        System.out.print("Enter a fruit to search: ");
        fruitToSearch = scanner.nextLine();
        fruitToSearch(fruits, fruitToSearch);

        for (int i = 0; i < numbers.length; i++) {
            if (numberToSearch == numbers[i]) {
                isFound = true;
                System.out.println("Found " + numberToSearch + " at index " + i);
                break;
            }
        }

        for (String fruit : fruits) {
            if (fruit.equals(fruitToSearch)) {
                isFound = true;
                System.out.println("Found " + fruitToSearch);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found");
        }
    }

    private static void fruitToSearch(String[] fruits, String fruitToSearch) {

        boolean isFound = false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruitToSearch.equals(fruits[i])) {
                isFound = true;
                System.out.println("Found " + fruitToSearch + " at index " + i);
                break;
            }
        }

        if (isFound) {
            System.out.println("Found " + fruitToSearch + " in the array");
        } else {
            System.out.println("Item is not found");
        }
    }
}
