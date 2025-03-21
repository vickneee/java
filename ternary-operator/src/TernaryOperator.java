import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ternary operator ? = return 1 of 2 values if a condition is true

        System.out.println("What was your exam score? ");
        int score = Integer.parseInt(scanner.nextLine());

//        if (score >= 60) {
//            System.out.println("PASS!");
//        } else {
//            System.out.println("FAIL!");
//        }

        String passOrFail = (score >= 60) ? "PASS!" : "FAIL!";

        System.out.println(passOrFail);

        scanner.close();
    }
}
