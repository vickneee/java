public class Main {

    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY",
        //                "MORPH" = "SHAPE", "FORM"
        //                The ability of an object to take on many objects (forms, shapes), other than its own
        //                Object can be treated as objects of a common superclass


        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        car.go();
        boat.go();
        bike.go();
    }
}
