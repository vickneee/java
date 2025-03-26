//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // toString = Method inherited from the Object class
        //            Used to describe the object with a string
        //            Useful for debugging purposes
        //            Can be overwriten to provide a specific implementation

        Car car1 = new Car("Chevy", "Camaro", 2022);
        Car car2 = new Car("Ford", "Mustang", 2023);

        System.out.println(car1);
        System.out.println(car2);
    }
}