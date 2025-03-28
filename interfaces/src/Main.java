public class Main {

    public static void main(String[] args) {

        // Interface = A blueprint for classes to implement set of abstract methods
        //            that a class must implement
        //            Interfaces are abstract and do not have a body
        //            Interfaces can have methods and variables
        //            Interfaces can be implemented by classes
        //            Supports multiple inheritance-like behavior

        // Create a new instance
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        // Call the flee method
        rabbit.flee();

        // Call the hunt method
        hawk.hunt();

        // Call the flee and hunt methods
        fish.flee();
        fish.hunt();


    }
}
