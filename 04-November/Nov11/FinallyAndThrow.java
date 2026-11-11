public class FinallyAndThrow {
    // Method to validate age
    static void checkAge(int age) {
        try {
            if (age < 18) {
                throw new IllegalArgumentException(
                    "Age must be 18 or above."
                );
            }
            System.out.println("Eligible for voting.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Checking Age: 16");
        checkAge(16);
        System.out.println();
        System.out.println("Checking Age: 25");
        checkAge(25);
        System.out.println("Program completed.");
    }
}