public class Main {

    public static void main(String[] args) {

        // Getters and Setters = a way to encapsulate and protect your data
        //                       from accidental corruption.
        // GETTERS = methods that get a value
        // SETTERS = methods that set a value

        Car car = new Car("Chevy", "Black", 2020, 23000.00);

        // Before using getters and setters
        // car.model = "Ford"; // Can change the value of the variable directly

        // Before using getters and setters
        // System.out.println("Car model: " + car.model);
        // System.out.println("Car color: " + car.color);
        // System.out.println("Car year: " + car.year);
        // System.out.println("Car price: " + car.price);

        // After using getters and setters
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car year: " + car.getYear());
        System.out.println("Car price: " + car.getPrice());

        // After using getters and setters
        car.setColor("Red");
        car.setYear(2021);
        car.setPrice(-25000.00);

        System.out.println("Car model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car year: " + car.getYear());
        System.out.println("Car price: " + car.getPrice());

    }
}
