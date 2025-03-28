public class Car {

    // Class members
    private final String make;
    private final String model;
    private final int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override // toStringMethod
    public String toString() {
        return this.year + " " + this.make + " " + this.model;
    }

}
