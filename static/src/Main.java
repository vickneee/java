public class Main {

    public static void main(String[] args) {

        // Static = keyword that makes the variable common to all objects
        // Static = variable is shared with all objects
        // Static = can be accessed directly by the class name

        Friend friend = new Friend("John");
        Friend friend1 = new Friend("Johanna");
        Friend friend2 = new Friend("Joonas");
        Friend friend3 = new Friend("Matti");

        System.out.println(friend.name);
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);

        Friend.displayFriends();

        System.out.println(Math.round(3.14));
    }
}
