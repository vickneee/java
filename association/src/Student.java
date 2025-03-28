class Student {

    // Variables
    String name;
    Course enrolledCourse;

    // Constructor Loose association
    Student(String name, Course course) {
        this.name = name;
        this.enrolledCourse = course;
    }

     // Constructor Tight association
     Student(String name, String courseName) {
         this.name = name;
         this.enrolledCourse = new Course(courseName); // Tight association
     }

    // Method to display the student name
    public void displayStudent() {
        System.out.println("Student: " + name);
    }

    // Method to display the student name
    public void displayStudentEnrolledCourse() {
        System.out.println("Student " + name + " enrolled in course " + enrolledCourse);
    }
}