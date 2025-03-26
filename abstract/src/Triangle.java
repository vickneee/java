public class Triangle extends Shape {

    double base;
    double height;

    Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    // Concrete method (has a body)
    @Override
    void display() {  // CONCRETE METHOD
        System.out.println("This is a triangle");
    }
}
