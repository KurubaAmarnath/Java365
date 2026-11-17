import java.util.HashSet;
import java.util.Iterator;
public class HashSetOperations {
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> students = new HashSet<>();
        // Add elements
        students.add("Amar");
        students.add("Rahul");
        students.add("Kiran");
        students.add("Arjun");
        System.out.println("Original HashSet: " + students);
        // Add duplicate element
        students.add("Amar");
        System.out.println("After Adding Duplicate: " + students);
        // Check element
        System.out.println("Contains Amar: "
                + students.contains("Amar"));
        // Remove element
        students.remove("Kiran");
        System.out.println("After Removal: " + students);
        // Size
        System.out.println("Total Students: "
                + students.size());
        // Iterate using Iterator
        System.out.println("\nStudent Names:");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Check empty
        System.out.println("\nIs Empty: "
                + students.isEmpty());
        // Clear HashSet
        students.clear();
        System.out.println("After Clear: " + students);
        System.out.println("Is Empty After Clear: "
                + students.isEmpty());
    }
}