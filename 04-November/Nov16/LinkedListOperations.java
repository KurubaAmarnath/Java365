import java.util.LinkedList;
public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        // Add elements
        students.add("Amar");
        students.add("Rahul");
        students.add("Kiran");
        students.add("Arjun");
        System.out.println("Original List: " + students);
        // Add at specific index
        students.add(1, "Ravi");
        System.out.println("After Insertion: " + students);
        // Add at first and last
        students.addFirst("Suresh");
        students.addLast("Vijay");
        System.out.println("After Adding First and Last: " + students);
        // Access elements
        System.out.println("First Element: " + students.getFirst());
        System.out.println("Last Element: " + students.getLast());
        System.out.println("Element at Index 2: " + students.get(2));
        // Update element
        students.set(2, "Prakash");
        System.out.println("After Update: " + students);
        // Remove elements
        students.remove("Kiran");
        students.removeFirst();
        students.removeLast();
        System.out.println("After Removal: " + students);
        // Search
        System.out.println("Contains Amar: " + students.contains("Amar"));
        // Find index
        System.out.println("Index of Arjun: " + students.indexOf("Arjun"));
        // Size
        System.out.println("Total Students: " + students.size());
        // Iterate using normal for loop
        System.out.println("\nStudent Names:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        // Check empty
        System.out.println("Is Empty: " + students.isEmpty());
        // Clear list
        students.clear();
        System.out.println("After Clear: " + students);
    }
}