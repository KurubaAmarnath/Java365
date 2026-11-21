import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapOperations {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        // Add key-value pairs
        students.put(103, "Rahul");
        students.put(101, "Amar");
        students.put(105, "Kiran");
        students.put(102, "Arjun");
        students.put(104, "Ravi");
        // Entries appear in insertion order
        System.out.println("Original LinkedHashMap: " + students);
        // Access a value using its key
        System.out.println("Student with ID 101: " + students.get(101));
        // Check whether a key or value exists
        System.out.println("Contains Key 102: " + students.containsKey(102));
        System.out.println("Contains Value Kiran: "
                + students.containsValue("Kiran"));
        // Update an existing value
        students.put(103, "Suresh");
        System.out.println("After Update: " + students);
        // Add a value only if the key is absent
        students.putIfAbsent(106, "Priya");
        System.out.println("After putIfAbsent: " + students);
        // Remove an entry
        students.remove(105);
        System.out.println("After Removal: " + students);
        // Iterate through entries in insertion order
        System.out.println("\nStudent Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Get the number of entries
        System.out.println("\nTotal Students: " + students.size());
        // Check whether the map is empty
        System.out.println("Is Empty: " + students.isEmpty());
        // Clear all entries
        students.clear();
        System.out.println("After Clear: " + students);
    }
}