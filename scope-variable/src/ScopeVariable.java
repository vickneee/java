public class ScopeVariable {

    static int y = 3; // CLASS VARIABLE
    static int x = 4; // CLASS VARIABLE NOT USED IN THIS EXAMPLE
    static double PI = 3.14159; // CLASS VARIABLE CONSTANT

    public static void main(String[] args) {

        int x = 1; // LOCAL VARIABLE

        System.out.println(x); // 1 (LOCAL VARIABLE x used because it is in the same scope)

        System.out.println("Class variable " + y); // 3 (CLASS VARIABLE y)

        System.out.println("Constant " + PI); // 3.14159 (CLASS VARIABLE CONSTANT PI)

        doSomething();
    }

    static void doSomething() {

        int x = 2; // LOCAL VARIABLE (DIFFERENT FROM THE LOCAL VARIABLE x IN THE MAIN METHOD SCOPE)

        System.out.println(x); // 2

        System.out.println("Class variable " + y); // 3 (CLASS VARIABLE y)
    }

}
