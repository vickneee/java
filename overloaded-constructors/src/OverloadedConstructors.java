public class OverloadedConstructors {

    // Overloaded constructors = multiple constructors within a class with the same name,
    //                           but have different parameters.
    //                           They are used to initialize objects in different ways.

    public static void main(String[] args) {

        User user0 = new User();
        User user1 = new User("Annika");
        User user2 = new User("Tomas", "tomas@gmail.com");
        User user3 = new User("John", "john@gmail.com", 25);

        System.out.println(user0.username); // Output: Guest
        System.out.println(user0.email); // Output: Not provided
        System.out.println(user0.age); // Output: 0

        System.out.println(user1.username);
        System.out.println(user1.email); // Output: Not provided
        System.out.println(user1.age); // Output: 0

        System.out.println(user2.username); // Output: Tomas
        System.out.println(user2.email); // Output: tomas@gmail.com
        System.out.println(user2.age); // Output: 0

        System.out.println(user3.username); // Output: John
        System.out.println(user3.email); // Output: john@gmail.com
        System.out.println(user3.age); // Output: 25
    }
}
