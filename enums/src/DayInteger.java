public enum DayInteger {

    // Enum constants representing the days of the week with their integer values
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    // Enum constants representing the days of the week
    private final int dayNumber; // Integer representation of the day

    // Constructor to initialize the enum constant with its integer representation
    DayInteger(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Method to get the integer representation of the day
    public int getDayNumber() {
        return dayNumber;
    }

    // Override toString method to return the integer representation of the day
    @Override
    public String toString() {
        return String.valueOf(dayNumber);
    }

    // Main method to demonstrate the usage of the enum
    public static void main(String[] args) {

        // Print all days of the week with their integer values
        for (DayInteger day : DayInteger.values()) {
            System.out.println(day);
        }

        // Print the integer representation of specific days
        System.out.println("Day number for MONDAY: " + DayInteger.MONDAY.getDayNumber());
        System.out.println("Day number for TUESDAY: " + DayInteger.TUESDAY.getDayNumber());
    }
}
