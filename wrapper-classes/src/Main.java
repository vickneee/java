public class Main {

    public static void main(String[] args) {

        // Wrapper classes =  are used to convert primitive data types
        //                    (int, char, double, boolean) into objects
        //                    and vice versa
        //                    (Integer, Character, Double, Boolean)
        //                    Generally don't wrap primitive data types unless
        //                    you need an object for some reason
        //                    (e.g. Collections, generics, etc.)

        // Primitive data types
        Integer a = new Integer(123);
        Double d = new Double(123.45);
        Character f = new Character('a');
        Boolean h = new Boolean(true);

        // Autoboxing = converting a primitive data type into an object
        Integer b = 123; // Autoboxing
        Double e = 123.45; // Autoboxing
        Character g = 'a'; // Autoboxing
        Boolean i = true; // Autoboxing

        // Unboxing = converting an object to a primitive data type
        int x = b; // Unboxing
        double y = e; // Unboxing
        char z = g; // Unboxing
        boolean j = i; // Unboxing

        String m = "Pizza";
        System.out.println(m);

    }
}
