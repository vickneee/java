public class Main {

    public static void main(String[] args) {

        // Create a new instance of Course and Student
        Course course = new Course("Java Programming");
        Student student = new Student("Alice", course);

        // Display the student
        student.displayStudent();

        // Display the course
        course.displayCourse();

        // Display the student and course
        student.displayStudentEnrolledCourse();
    }
}
