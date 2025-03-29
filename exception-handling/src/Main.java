import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround the dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("That wasn't a number!");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("This always executes!");
        }

    }
}
