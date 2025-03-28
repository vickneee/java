public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Black");
        Car car2 = new Car("Audi", "White");
        Car car3 = new Car("Mercedes", "Silver");

        Car[] cars = new Car[3];

        Car[] cars1 = {car1, car2, car3};

        Car[] cars2 = {new Car("BMW", "Black"),
                        new Car("Audi", "White"),
                        new Car("Mercedes", "Silver")};

        for (Car car : cars1) {
            car.drive();
        }

        for (Car car : cars2) {
            car.color = "Red";
        }

        for (Car car : cars2) {
            car.drive();
        }
    }

}
