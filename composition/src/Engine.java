public class Engine {

    // Variables
    String type;

    // Constructor
    Engine(String type) {
        this.type = type;
    }

    // toString method
    // Need to override the toString() method in the Engine class to display the engine type
    public String toString() {
        return type;
    }
}
