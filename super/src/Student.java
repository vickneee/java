public class Student extends Person {

    // Variables
    double grade;

    // Constructor
    Student(String first, String last, int age, double grade) {
        super(first, last, age);
        this.grade = grade;
    }

    // Method (function)
    void showGrade() {
        System.out.println(this.first + " " + this.last + " grade is " + this.grade);
    }

}
