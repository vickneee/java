import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = reader.nextLine();

        System.out.println("What is your age?");
        int age = Integer.parseInt(reader.nextLine());

        // Integer.parseInt(); int x = Integer.parseInt("123");
        // Double.parseDouble(); double y = Double.parseDouble("123.45");
        // Boolean.parseBoolean(); boolean z = Boolean.parseBoolean("true");

        System.out.println("Hello " + name + ", you are " + age + " years old!");

        reader.close();
    }
}
