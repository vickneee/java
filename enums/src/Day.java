public enum Day {

    // Enum constants representing the days of the week
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

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

        // Print all days of the week with their string values
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Print the string representation of specific days
        System.out.println("Day name for MONDAY: " + Day.MONDAY.getDayName());
        System.out.println("Day name for TUESDAY: " + Day.TUESDAY.getDayName());
        System.out.println("Day name for WEDNESDAY: " + Day.WEDNESDAY.getDayName());
    }
}
