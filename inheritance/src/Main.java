public class Main {

    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               of another class
        //               GrandParent --> Parent class --> child class

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Cat: " + cat.isAlive);
        System.out.println("Dog: " + dog.isAlive);

        cat.eat();
        dog.eat();

        cat.meow();
        dog.bark();

        System.out.println("Cat lives: " + cat.lives);
        System.out.println("Dog lives: " + dog.lives);

        Plant plant = new Plant();

        plant.photosynthesize();
        // dog.photosynthesize(); // Error: cannot find method photosynthesize in Dog class

    }
}
