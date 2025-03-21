import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result = 0;

        System.out.println("Calculator");
        System.out.println("---------------");

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.nextLine().charAt(0);

        System.out.println("Enter a first number: ");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter a second number: ");
        double number2 = Double.parseDouble(scanner.nextLine());

        switch (operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
            default -> System.out.println("Invalid operator");
        }
        System.out.printf("The result is %.2f ", result);

        scanner.close();
    }
}