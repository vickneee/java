import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // This is a comment
        /* This is
        a multiline
        comment */

        System.out.println("I like pizza!");
        System.out.println("I like pizza too!");
        System.out.print("I like pizza too!\n"); // \n is a new line
        System.out.println("I like pizza too!");

        int myNum = 5;
        System.out.println(myNum);

        int age = 21;
        System.out.println("I am " + age + " years old.");

        double myDouble = 3.14;
        System.out.println(myDouble);

        char myLetter = 'D';
        System.out.println(myLetter);

        String myText = "Victoria";
        System.out.println(myText);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age2 = scanner.nextInt();

        System.out.println("Please enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Are you a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Your name is: " + name + " and your age is: " + age2 + " and your height is: " + height);

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are NOT a student.");
        }

        // Close the scanner
        scanner.close();
    }
}