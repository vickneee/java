import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("Java Calculator App");
        System.out.println("-------------------");

        System.out.println("Enter an operator (+, -, *, /): ");
        operator = scanner.nextLine().charAt(0);

        System.out.println("Enter a first number: ");
        number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter a second number: ");
        number2 = Double.parseDouble(scanner.nextLine());

        switch (operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero");
                    validOperator = false;
                } else {
                    result = number1 / number2;
                }
            }

            default -> {
                System.out.println("Invalid operator");
                validOperator = false;
            }
        }
        if (validOperator) {
            System.out.printf("The result is %.2f ", result);
        }

        scanner.close();
    }
}