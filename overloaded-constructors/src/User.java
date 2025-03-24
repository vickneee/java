public class User {

    String username;
    String email;
    int age;

    User() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    // Constructor with 1 parameter
    User(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    // Constructor with 2 parameters
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    // Constructor with 3 parameters
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
