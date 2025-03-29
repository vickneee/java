import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Generics = A way to create classes, interfaces, and methods with a placeholder for the type of data they store or use
        //            (ArrayList<T>, HashMap<K,V>, etc.)
        //            <T> = Type parameter placeholder that can be replaced with different data types
        //            <K,V> = Key, Value
        //            <E> = Element
        //            <N> = Number
        //            <String> = Type of data argument

        // Example: ArrayList<String>
        // Example: HashMap<String, Integer>

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits);

        // Example: ArrayList<Integer>
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
    }
}
