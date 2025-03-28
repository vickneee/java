public class Main {

    public static void main(String[] args) {

        // Composition = Represents a "part of" relationship between two objects
        //               In composition, the objects are dependent on each other
        //               The objects cannot exist independently
        //               The objects are destroyed together
        //               The objects are created together
        //               The objects are created in the constructor of the class

        // Create a new car object
        Car car = new Car("Toyota", 2021 , "V6");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        // Display the car details
        car.displayCar(); // Model: Toyota, Year: 2021, Engine: Engine@1b6d3586 (memory address)
        // Need to override the toString() method in the Engine class to display the engine type

        // Start the car
        car.start(); // You start the V6 engine. You start the Toyota.
    }
}
