public class Main {

    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY",
        //                "MORPH" = "SHAPE", "FORM"
        //                The ability of an object to take on many objects (forms, shapes), other than its own
        //                Object can be treated as objects of a common superclass


        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

//        car.go();
//        boat.go();
//        bike.go();

//        Car[] cars = {car , boat, bike};
//        Boat[] boats = {car , boat, bike};
//        Bike[] bikes = {car , boat, bike};

        Vehicle[] vehicles = {car, boat, bike};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
