import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enhanced Switch");
        System.out.println("---------------");
        System.out.println("Enter a day of the week: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend");
            default -> System.out.println("Invalid day");
        }

        scanner.close();
    }
}
