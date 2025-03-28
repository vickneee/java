public class Car {

    // Variables
    String model;
    int year;
    Engine engine;

    // Constructor
    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    // Method to display the car details
    void displayCar() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine: " + engine); // Calls the toString() method in the Engine class
    }
}
