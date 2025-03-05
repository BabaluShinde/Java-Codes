package main.javaCollectionFramework;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        // Adding key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(null, "NoName");		 // Allows null keys
        map.put(4, null); 				// Allows null values

        // Printing HashMap
        System.out.println("HashMap: " + map);
        
        // Replace the value for key 2
        String oldValue = map.replace(2, "John");

        System.out.println("Replaced value: " + oldValue);
        System.out.println("Updated map: " + map);
    }
}
