public class Employee extends Person {

    double salary;

    // Constructor
    Employee(String first, String last, int age, double salary) {
        super(first, last, age);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + " " + this.last + " salary is " + this.salary);
    }

}