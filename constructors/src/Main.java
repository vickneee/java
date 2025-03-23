public class Main {

    public static void main(String[] args) {

        // constructors = special type of method that is used to initialize objects
        //                You pass arguments to the constructor when creating the object
        //                It is used to put values into the object's fields

        Student student1 = new Student("Jane Doe", 19, 3.5);
        Student student2 = new Student("John Smith", 20, 3.0);
        Student student3 = new Student("Alice Wonderland", 21, 3.8);

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("GPA: " + student1.gpa);
        System.out.println("Is Enrolled: " + student1.isEnrolled);

        System.out.println();

        System.out.println("Student 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("GPA: " + student2.gpa);
        System.out.println("Is Enrolled: " + student2.isEnrolled);

        System.out.println();
        System.out.println("Student 3:");
        System.out.println("Name: " + student3.name);
        System.out.println("Age: " + student3.age);
        System.out.println("GPA: " + student3.gpa);
        System.out.println("Is Enrolled: " + student3.isEnrolled);

        System.out.println();
        student1.study();
        student2.study();
        student3.sleep();
    }
}
