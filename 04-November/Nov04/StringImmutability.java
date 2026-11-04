public class StringImmutability {
    public static void main(String[] args) {
        String name = "Java";
        System.out.println("Original String: " + name);
        // Concatenation
        name.concat(" Programming");
        System.out.println("After concat(): " + name);
        // Store the modified result
        name = name.concat(" Programming");
        System.out.println("After reassignment: " + name);
        // Replace
        String updatedName = name.replace("Java", "Python");
        System.out.println("Original: " + name);
        System.out.println("Updated: " + updatedName);
        // Uppercase
        String upper = name.toUpperCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Original: " + name);
    }
}