public class VarArgs {

    public static void main(String[] args) {

        // varargs = allows you to input as many arguments as you want
        //           makes the method accept any number of arguments
        //           can only be used as the last parameter
        //           java treats varargs as an array
        //           ... (ellipsis) is the syntax for varargs

        System.out.println(add(1, 2, 3, 4, 5));

        System.out.println(average(1, 2, 3, 4, 5));

        // // Method overloading
        // System.out.println(add(1, 2, 3));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // // Method overloading
    // static double add(int a, int b) { return a + b; }
    // static double add(int a, int b, int c) { return a + b + c; }
    // static double add(int a, int b, int c, int d) { return a + b + c + d; }
}
