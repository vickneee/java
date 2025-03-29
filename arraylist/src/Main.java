import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // ArrayList = a resizable array that can grow as needed
        //             that stores objects (autoboxing)
        //             ArrayList is part of the Java Collection Framework
        //             ArrayList implements the List interface
        //             ArrayList stores elements in a dynamic array
        //             ArrayList is not synchronized
        //             ArrayList allows duplicate elements
        //             ArrayList allows random access to elements

        // Create an ArrayList of Integers
        ArrayList<Integer> listInt = new ArrayList<>();

        // Add elements to the ArrayList
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);

        // Print the ArrayList
        System.out.println("ArrayList of Integers: " + listInt);

        // Remove an element from the ArrayList
        listInt.remove(1); // removes the element at index 1 (2)

        // Print the ArrayList after removal
        System.out.println("After removal: " + listInt);

        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + listInt.size());

        // Check if the ArrayList contains an element
        System.out.println("Contains 3: " + listInt.contains(3));

        // Get an element from the ArrayList at a specific index
        System.out.println("Element at index 0: " + listInt.get(0));

        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Hello");
        list.add("World");
        list.add("!");

        // Print the ArrayList
        System.out.println("ArrayList of Strings: " + list);

        // Remove an element from the ArrayList
        list.remove("World");

        // Print the ArrayList after removal
        System.out.println("After removal: " + list);

        // ArrayList of Fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Durian");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        // Print the ArrayList
        System.out.println("ArrayList of Fruits: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove("Banana");

        // Print the ArrayList after removal
        System.out.println("After removal: " + fruits);

        // Create a Collection of Strings
        Collections.sort(fruits);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList of Fruits: " + fruits);

        // Print the ArrayList using a for-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Find the index of an element
        int index = fruits.indexOf("Cherry");
        System.out.println("Index of Cherry: " + index);

        // Check if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + fruits.isEmpty());
    }
}
