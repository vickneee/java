class Course {

    // Variables
    String name;

    // Constructor
    Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Method to display the course name
    public void displayCourse() {
        System.out.println("Course: " + name);
    }
}