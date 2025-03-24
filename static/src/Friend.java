public class Friend {

    static int numOfFriends = 0;
    String name;

    Friend (String name) {
        this.name = name;
        numOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numOfFriends + " total friends");
    }
}
