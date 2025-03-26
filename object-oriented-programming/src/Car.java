public class Car {

    String make;
    String model;
    int year;
    double price;
    boolean isRunning;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = false;
    }

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
