import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ! - NOT : Reverses the boolean result of the condition.
        // && - AND : Both conditions must be true for the if statement to execute.
        // || - OR : At least one condition must be true for the if statement to execute.

        double temp;
        boolean isSunny = true;

        System.out.println("Enter the temperature: ");
        temp = Double.parseDouble(scanner.nextLine());

        if (temp >=15 && temp <= 35 && isSunny) {
            System.out.println("It is warm and sunny");
        } else if (temp < 15 && !isSunny) {
            System.out.println("It is cold and not sunny");
        } else {
            System.out.println("The weather is bad");
        }

        scanner.close();
    }
}
