public class Array {

    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana", "kiwi"};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        // System.out.println(fruits[4]); Index 4 out of bounds for length 4 at Array

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        // For loop
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        // Enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
