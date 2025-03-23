public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2020;
    double price = 50000.00;
    boolean isRunning = false;


    void start() {
        isRunning = true;
        System.out.println("Car is starting...");
    }

    void stop() {
        isRunning = false;
        System.out.println("Car is stopping...");
    }

    void drive() {
        if (isRunning) {
            System.out.println("Car is driving...");
        } else {
            System.out.println("Car is not running.");
        }
    }
}
