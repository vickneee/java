import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        //           (HashMap<K,V>, HashMap<String,Integer>, etc.)
        //           (HashMap<String, Integer> map = new HashMap<>();)
        //           (map.put("key", value);)
        //           (map.get("key");)
        //           (map.remove("key");)
        //           (map.containsKey("key");)
        //           (map.containsValue(value);)
        //           (map.size();)
        //           (map.isEmpty();)
        //           Does not maintain order, but allows fast access to values

        HashMap<String, Double> map = new HashMap<>();

        // Adding values
        map.put("Apple", 1.8);
        map.put("Banana", 2.0);
        map.put("Cherry", 3.4);
        map.put("Date", 4.2);

        // Printing the map
        System.out.println(map);

        // Iterating through the map
        for (String key : map.keySet()) {
            System.out.println(key + ": €" + map.get(key));
        }

        // Accessing values
        System.out.println("Price of Banana: " + map.get("Banana"));
        System.out.println("Price of Cherry: " + map.get("Cherry"));
        System.out.println("Price of Date: " + map.get("Date"));
        System.out.println("Price of Apple: " + map.get("Apple"));
        System.out.println("Price of Orange: " + map.get("Orange")); // null
        System.out.println("Price of Mango: " + map.get("Mango")); // null

        // Removing values
        map.remove("Banana");
        System.out.println("After removing Banana: " + map);
        System.out.println("Price of Banana: " + map.get("Banana")); // null

        // Checking if a key exists
        System.out.println("Contains key 'Apple': " + map.containsKey("Apple"));
        System.out.println("Contains key 'Banana': " + map.containsKey("Banana"));

        // Checking if a value exists
        System.out.println("Contains value 1.8: " + map.containsValue(1.8));
        System.out.println("Contains value 2.0: " + map.containsValue(2.0));

        // Getting the size of the map
        System.out.println("Size of map: " + map.size());

        // Checking if the map is empty
        System.out.println("Is map empty: " + map.isEmpty());

        // Clearing the map
        map.clear();
        System.out.println("After clearing map: " + map);
    }
}
