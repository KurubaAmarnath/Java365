public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        System.out.println("Original: " + builder);
        // Append
        builder.append(" Programming");
        System.out.println("Append: " + builder);
        // Insert
        builder.insert(5, "Advanced ");
        System.out.println("Insert: " + builder);
        // Replace
        builder.replace(5, 13, "Core");
        System.out.println("Replace: " + builder);
        // Delete
        builder.delete(5, 10);
        System.out.println("Delete: " + builder);
        // Set character
        builder.setCharAt(0, 'j');
        System.out.println("Set Character: " + builder);
        // Reverse
        builder.reverse();
        System.out.println("Reverse: " + builder);
        // Length
        System.out.println("Length: " + builder.length());
        // Capacity
        System.out.println("Capacity: " + builder.capacity());
    }
}