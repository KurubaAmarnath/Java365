import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        // Add elements
        students.add("Amar");
        students.add("Rahul");
        students.add("Kiran");
        students.add("Arjun");
        System.out.println("Original List: " + students);
        // Add at specific index
        students.add(1, "Ravi");
        System.out.println("After Insertion: " + students);
        // Access element
        System.out.println("Student at index 2: "
                + students.get(2));
        // Update element
        students.set(2, "Suresh");
        System.out.println("After Update: " + students);
        // Remove element
        students.remove("Kiran");
        System.out.println("After Removal: " + students);
        // Search element
        System.out.println("Contains Amar: "
                + students.contains("Amar"));
        // Find index
        System.out.println("Index of Arjun: "
                + students.indexOf("Arjun"));
        // Size
        System.out.println("Total Students: "
                + students.size());
        // Iterate using normal for loop
        System.out.println("\nStudent Names:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        // Check empty
        System.out.println("Is Empty: "
                + students.isEmpty());
        // Clear list
        students.clear();
        System.out.println("After Clear: " + students);
        sc.close();
    }
}