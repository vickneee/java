import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0 ) {
            System.out.println("The number is positive!");
        }
        else if (number < 0) {
            System.out.println("The number is negative!");
        }
        else {
            System.out.println("The number is zero!");
        }

        scanner.close();
    }
}

//    == - equal to
//    != - not equal to
//    > - greater than
//    >= - greater than or equal to
//        < - less than
//    <= - less than or equal to
//    ! - logical NOT
//    && - logical AND
//    || - logical OR
