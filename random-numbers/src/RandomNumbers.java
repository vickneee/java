import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        int number;
        double numberExample;

        numberExample = random.nextDouble(); // Random number between 0 and 1

        number = random.nextInt(1, 101);

        System.out.println(number);
        System.out.println(numberExample);

        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }
    }
}
