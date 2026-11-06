public class StringBufferOperations {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Java");
        System.out.println("Original: " + buffer);
        // Append
        buffer.append(" Programming");
        System.out.println("Append: " + buffer);
        // Insert
        buffer.insert(5, "Advanced ");
        System.out.println("Insert: " + buffer);
        // Replace
        buffer.replace(5, 13, "Core");
        System.out.println("Replace: " + buffer);
        // Delete
        buffer.delete(5, 10);
        System.out.println("Delete: " + buffer);
        // Set Character
        buffer.setCharAt(0, 'j');
        System.out.println("Set Character: " + buffer);
        // Reverse
        buffer.reverse();
        System.out.println("Reverse: " + buffer);
        // Length
        System.out.println("Length: " + buffer.length());
        // Capacity
        System.out.println("Capacity: " + buffer.capacity());
    }
}