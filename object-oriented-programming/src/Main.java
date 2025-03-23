public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);

        car1.start();
        car2.stop();
    }
}
