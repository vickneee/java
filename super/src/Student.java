public class Student extends Person {

    double gpa;

    // Constructor
    Student(String first, String last, int age, double gpa) {
        super(first, last, age);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + " GPA is " + this.gpa);
    }

}
