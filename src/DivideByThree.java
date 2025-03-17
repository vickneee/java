import java.util.Scanner;

public class DivideByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int intValue = Integer.parseInt(scanner.nextLine());

        double doubleValue = (double)intValue / 3;

        System.out.println("The result is: " + doubleValue);

        scanner.close();
    }
}
