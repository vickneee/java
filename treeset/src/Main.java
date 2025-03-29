import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // TreeSet = a collection that stores elements in a sorted order
        //         = implements the Set interface
        //         = does not allow duplicate elements
        //         = does not allow null elements
        //         = is not synchronized

        // Creating a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(9);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(2);

        // Printing the sorted elements
        for (int num : treeSet) {
            System.out.println(num);
        }
    }
}
