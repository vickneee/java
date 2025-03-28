import java.util.Scanner;

public class NestedIfStatements {

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        number = Integer.parseInt(scanner.nextLine());

        if (number > 0) {
            System.out.println("The number is positive!");
        }
        else {
            if (number < 0) {
                System.out.println("The number is negative!");
            }
            else {
                System.out.println("The number is zero!");
            }
        }
    }
}
