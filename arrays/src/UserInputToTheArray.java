import java.util.Scanner;

public class UserInputToTheArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int arrayLength;

        System.out.print("Enter number of foods: ");
        arrayLength = Integer.parseInt(scanner.nextLine());
        System.out.println();

        foods = new String[arrayLength];

        // For loop
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

         // Enhanced for loop
          for (String food : foods) {
             System.out.println(food);
         }
    }
}
