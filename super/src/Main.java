public class Main {

    // Super = parent (superclass) of the class that extends it child (subclass)
    //         used in constructors and methods overriding
    //         used to access parent class properties (constructor, method, field)

    public static void main(String[] args) {

        // Create an object of the subclass
        Person person = new Person("John", "Doe", 30);

        // Call the method of the subclass
        person.showName();

        // Create an object of the subclass
        Student student = new Student("Jane", "Doe", 28, 3.5);
        Employee employee = new Employee("Tom", "Smith", 35, 50000);

        // Call the method of the subclass
        student.showName();
        student.showGPA();

        employee.showName();
        employee.showSalary();
    }
}
