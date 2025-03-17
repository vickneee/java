import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // This is a comment
        /* This is a multiline
        comment */

        System.out.println("I like pizza!");
        System.out.println("I like pizza too!");
        System.out.print("I like pizza too!\n");
        System.out.println("I like pizza too! cm");

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

        System.out.println("Your name is: " + name + " and your age is: " + age2 + " and your height is: " + height);

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are NOT a student.");
        }

        // Mad Libs Game

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to the" + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 +" was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was a " + adjective3 + "!");

        // Close the scanner
        scanner.close();
    }
}