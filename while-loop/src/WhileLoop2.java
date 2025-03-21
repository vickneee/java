import java.util.Scanner;

public class WhileLoop2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String response = "";

        while (!response.equals("Q")) {
            System.out.print("You want to quit? (Q to quit): ");
            response = reader.next().toUpperCase();
        }
        System.out .println("You quit the program!");

        reader.close();
    }
}
