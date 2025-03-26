//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Abstract = Used to define abstract classes and methods
        //            Abstract is process of hiding the implementation details
        //            and showing only essential features;
        //            Abstract class can't be instantiated directly
        //            Can contain 'abstract' methods (that must be implemented by the subclass)
        //            Can contain 'concrete' methods (witch are inherited by the subclass)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(6,7 );

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

        circle.display();
        triangle.display();
        rectangle.display();

    }
}