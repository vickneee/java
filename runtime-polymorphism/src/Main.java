import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Runtime polymorphism = When the method that is called is decided
        //                        at runtime based on the type of the object.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'dog' or 'cat' (1 = dog, 2 = cat): ");
        int choice = Integer.parseInt(scanner.nextLine());

        Animal animal;

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

    }
}
