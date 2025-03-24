public class OverloadedMethods {

    public static void main(String[] args) {

        // Overloaded methods = methods that share the same name but have different parameters
        // Method overloading = allows us to define the same method with different parameters
        //                      signatures = name + parameters

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 3, 4, 5));

    }

    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    static double add(double a, double b, double c, double d, double e) {
        return a + b + c + d + e;
    }
}
