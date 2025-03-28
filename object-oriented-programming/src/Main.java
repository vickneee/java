public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 2020, 20000.00);
        Car car2 = new Car("Honda", "Civic", 2021, 25000.00);

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println("Car is running " + car1.isRunning);

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);

        car1.start();
        car2.stop();
        car2.drive();
        car2.start();
        car2.drive();
    }
}
