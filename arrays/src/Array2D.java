import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        //            Useful for storing matrices or tables

        String[] fruits = {"apple", "banana", "kiwi"};
        String[] vegetables = {"potato", "carrot", "spinach"};
        String[] meat = {"chicken", "beef", "pork"};

        String[][] groceryList = {
            fruits,
            vegetables,
            meat
        };

        for (String[] foods : groceryList) {
            System.out.println(Arrays.toString(foods));
        }

        String[][] groceryList2 = {
                {"apple2", "banana2", "kiwi2"},
                {"potato2", "carrot2", "spinach2"},
                {"chicken2", "beef2", "pork2"}
        };

//        for (String[] foods : groceryList2) {
//            System.out.println(Arrays.toString(foods));
//        }

        for (String[] foods : groceryList2) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        char [][] telePhone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

//        for (char[] row : telePhone) {
//            System.out.println(Arrays.toString(row));
//        }

        for (char[] row : telePhone) {
            for (char n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
