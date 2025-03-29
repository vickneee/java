public class Main {

    public static void main(String[] args) {

        Part part1 = new Part("av3698", "Garmin", "G3000", 51200f);
        Part part2 = new Part("av3698", "Garmin", "G3000", 51200f);


        // Compare the two Part objects using ==
        // This compares the references, not the content of the objects
        // In this case, part1 and part2 are different objects in memory
        if (part1 == part2)
            System.out.println("Parts are equal");
        else
            System.out.println("Parts are not equal");

        // Compare the two Part objects using equals()
        if (part1.equals(part2))
            System.out.println("Parts are equal");
        else
            System.out.println("Parts are not equal");
    }
}
