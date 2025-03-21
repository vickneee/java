public class Method {

    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        String name = "John";
        int age = 30;
        int myNumber = 5;
        String first = "John";
        String last = "Doe";

        myMethod(name, age);
        System.out.println(square(myNumber));
        System.out.println(cube(myNumber));
        System.out.println(getFullName(first, last));
        System.out.println(isAdult(age));
    }

    static void myMethod(String name, int age) {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    static double square(double number) { return number * number; }
    static double cube(double number) { return number * number * number; }
    static String getFullName(String firstName, String lastName) { return firstName + " " + lastName; }
    static boolean isAdult(int age) { return age >= 18; }
}
