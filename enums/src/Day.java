import java.util.Scanner;

public enum Day {

    // Enum constants representing the days of the week
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday"),
    PIZZADAY("PizzaDay");

    // Enum constants representing the days of the week
    private final String dayName; // String representation of the day

    // Constructor to initialize the enum constant with its string representation
    Day(String dayName) {
        this.dayName = dayName;
    }

    // Method to get the string representation of the day
    public String getDayName() {
        return dayName;
    }

    // Override toString method to return the string representation of the day
    @Override
    public String toString() {
        return dayName;
    }

    // Main method to demonstrate the usage of the enum
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Example of using the enum with a switch statement
        System.out.print("Enter a day of the week (e.g., Monday): ");
        String input = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(input);

            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY
                    -> System.out.println("It's a weekday!");
                case SATURDAY,
                     SUNDAY,
                     PIZZADAY
                    -> System.out.println("It's a weekend!");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }

        // Example of using the overridden toString method
        // System.out.println("Selected day: " + Day.MONDAY); // Print the selected day

        // Print all days of the week with their string values
        // for (Day dayX : Day.values()) {
        //     System.out.println(dayX);
        // }
    }
}
