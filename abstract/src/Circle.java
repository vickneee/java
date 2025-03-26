public class Circle extends Shape {

    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    // Concrete method (has a body)
    @Override
    void display() {  // CONCRETE METHOD
        System.out.println("This is a circle");
    }
}
