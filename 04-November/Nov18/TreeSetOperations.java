import java.util.TreeSet;
public class TreeSetOperations {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();
        // 1. Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20); // Duplicate
        System.out.println("TreeSet: " + numbers);
        // 2. Search for an element
        System.out.println("Contains 30: " + numbers.contains(30));
        // 3. Remove an element
        numbers.remove(40);
        System.out.println("After removal: " + numbers);
        // 4. First and last elements
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        // 5. Smaller and larger elements
        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Higher than 30: " + numbers.higher(30));
        // 6. Iterate using a normal for loop
        System.out.println("Elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        // 7. Size
        System.out.println("Size: " + numbers.size());
        // 8. Clear the TreeSet
        numbers.clear();
        System.out.println("After clear: " + numbers);
        System.out.println("Is empty: " + numbers.isEmpty());
    }
}