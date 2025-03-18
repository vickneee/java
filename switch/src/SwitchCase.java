import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            default:
                System.out.println("This is a default value!");
                break;
        }

        scanner.close();
    }
}
