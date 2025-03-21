import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enhanced Switch");
        System.out.println("---------------");
        System.out.println("Enter a day of the week: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("Monday is 1st day of the week");
            case "Tuesday" -> System.out.println("Tuesday is 2nd day of the week");
            case "Wednesday" -> System.out.println("Wednesday is 3rd day of the week");
            case "Thursday" -> System.out.println("Thursday is 4th day of the week");
            case "Friday" -> System.out.println("Friday is 5th day of the week");
            case "Saturday" -> System.out.println("Saturday is 6th day of the week");
            case "Sunday" -> System.out.println("Sunday is 7th day of the week");
            default -> System.out.println("Invalid day");
        }

    }
}
