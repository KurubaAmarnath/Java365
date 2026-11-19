import java.util.HashMap;
import java.util.Scanner;
public class HashMapOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            System.out.print("Enter student name: ");
            String name = sc.next();
            students.put(id, name);
        }
        // Display HashMap
        System.out.println("\nStudent Records:");
        System.out.println(students);
        // Retrieve value
        System.out.print("\nEnter ID to search: ");
        int searchId = sc.nextInt();
        if (students.containsKey(searchId)) {
            System.out.println(
                "Student Name: " + students.get(searchId)
            );
        } else {
            System.out.println("Student not found.");
        }
        // Check value
        System.out.print("\nEnter name to check: ");
        String searchName = sc.next();
        System.out.println(
            "Value exists: " +
            students.containsValue(searchName)
        );
        // Remove entry
        System.out.print("\nEnter ID to remove: ");
        int removeId = sc.nextInt();
        students.remove(removeId);
        // Final records
        System.out.println("\nUpdated Records:");
        System.out.println(students);
        System.out.println("Total Students: " + students.size());
        sc.close();
    }
}