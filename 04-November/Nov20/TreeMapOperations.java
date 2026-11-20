import java.util.TreeMap;
import java.util.Map;
public class TreeMapOperations {
    public static void main(String[] args) {
        // Create TreeMap
        TreeMap<Integer, String> students = new TreeMap<>();
        // 1. Add key-value pairs
        students.put(103, "Rahul");
        students.put(101, "Amar");
        students.put(105, "Kiran");
        students.put(102, "Arjun");
        students.put(104, "Ravi");
        System.out.println("Original TreeMap: " + students);
        // 2. Access value using key
        System.out.println("Student with ID 101: "
                + students.get(101));
        // 3. Update value
        students.put(103, "Suresh");
        System.out.println("After Update: " + students);
        // 4. Check key
        System.out.println("Contains Key 102: "
                + students.containsKey(102));
        // 5. Check value
        System.out.println("Contains Value Amar: "
                + students.containsValue("Amar"));
        // 6. Remove entry
        students.remove(105);
        System.out.println("After Removal: " + students);
        // 7. First and Last entries
        System.out.println("First Entry: "
                + students.firstEntry());
        System.out.println("Last Entry: "
                + students.lastEntry());
        // 8. First and Last keys
        System.out.println("First Key: "
                + students.firstKey());
        System.out.println("Last Key: "
                + students.lastKey());
        // 9. Iterate through TreeMap
        System.out.println("\nStudent Records:");
        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {
            System.out.println(
                    entry.getKey() + " : " + entry.getValue());
        }
        // 10. Size
        System.out.println("\nTotal Students: "
                + students.size());
        // 11. Clear
        students.clear();
        System.out.println("After Clear: " + students);
        System.out.println("Is Empty: "
                + students.isEmpty());
    }
}