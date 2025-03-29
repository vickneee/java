import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> scores = new HashMap<>();

        // Add key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Examples of HashMap usage
        // Get the size of the HashMap
        System.out.println("Size of HashMap: " + scores.size());
        // Remove a key-value pair
        scores.remove("Bob");
        // Add a new key-value pair
        scores.put("David", 80);
        // Contains key
        boolean hasAlice = scores.containsKey("Alice");
        System.out.println("Does Alice exist? " + hasAlice);
        // Get value by key
        int davidScore = scores.get("David");
        System.out.println("David's score: " + davidScore); // This will return null since Bob was removed

        // Retrieve values
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Check if a key exists
        boolean hasCharlie = scores.containsKey("Charlie");
        System.out.println("Does Charlie exist? " + hasCharlie);

        // Iterate over the key-value pairs
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s score: " + score);
        }

        // Remove a key-value pair
        scores.remove("Bob");
    }
}